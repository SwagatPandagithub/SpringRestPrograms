package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ch.qos.logback.core.Context;
import in.ineuron.service.IPurchaseOrder;
import in.ineuron.service.IPurchaseOrderImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		IPurchaseOrder order = context.getBean(IPurchaseOrderImpl.class);

		try {

			String msg = order.purchase(new String[] { "fossil", "tissot", "casio" },
					new double[] { 4000.0, 5000.0, 6000.0 }, new String[] { "swagat.panda1997@gmail.com",
							"swagat.panda2020@gmail.com", "swagat.panda2021@gmail.com" });

			System.out.println(msg);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
