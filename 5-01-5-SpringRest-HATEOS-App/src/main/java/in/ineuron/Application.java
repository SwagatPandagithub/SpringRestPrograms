package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.ineuron.restController.TelevisionController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	  ApplicationContext context = SpringApplication.run(Application.class, args);
	  	//TelevisionController bean = context.getBean(TelevisionController.class);
	  	
	  	
	}

}
