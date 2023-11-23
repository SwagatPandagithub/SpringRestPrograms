package in.ineuron.service;

import java.util.Arrays;
import java.util.Date;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;


@Service("service")
public class IPurchaseOrderImpl implements IPurchaseOrder {

	@Autowired
	private JavaMailSender sender;
	
	@Value("${spring.mail.username}")
	private String fromEmail;

	@Override
	public String purchase(String[] items, double[] prices, String[] toEmails) throws Exception {

		double amt = 0.0;
		for (double price : prices) {
			amt = amt + price;
		}

		String msg = Arrays.toString(items) + " with prices " + Arrays.toString(prices) + " Total Amount is  " + amt;

		String status = sendMail(msg, toEmails);

		return msg + "---->" + status;
	}

	private String sendMail(String msg, String[] mails) throws Exception {
		
		System.out.println("The implementation class of the sender object"+sender.getClass());
		
	
			
			
			MimeMessage message =  sender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message,true);
			
			helper.setFrom(fromEmail);
			helper.setCc(mails);
			helper.setSubject("Open it to Know it");
			helper.setSentDate(new Date());
			helper.setText(msg);
			helper.addAttachment("amazon.jpg", new ClassPathResource("amazon.jpg"));
			sender.send(message);
			
			
	
		
		return "mail-sent";
	}

}
