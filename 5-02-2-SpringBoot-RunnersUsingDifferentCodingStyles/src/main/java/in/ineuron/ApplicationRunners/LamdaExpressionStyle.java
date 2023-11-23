package in.ineuron.ApplicationRunners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LamdaExpressionStyle {
	
	@Bean
	public CommandLineRunner runB() {
		
		CommandLineRunner obj=(args)->{
			System.out.println("From Runner :: "+Arrays.asList(args));
		};
		
		
		
		return obj;
	}
	
	
}
