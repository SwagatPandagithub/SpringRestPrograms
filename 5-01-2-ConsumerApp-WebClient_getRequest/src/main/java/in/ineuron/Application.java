package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.ineuron.runner.CurrencyService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		
		
		ApplicationContext context = SpringApplication.run(Application.class, args);
		CurrencyService servicebean = context.getBean("service",CurrencyService.class);
		String from = "USD";
		String to="INR";
		servicebean.invokeRestApiSync(from,to);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		servicebean.invokeRestApiASynchronous(from, to);
		
	}

}
