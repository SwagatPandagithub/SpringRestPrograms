package in.ineuron.ApplicationRunners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//To state bean definations to application context
public class InnerclassStyle {
	
	//We need to create a implementation class object as commandLineRunner is a functional interface
	//it is not required to write implementation class if we opt for Annonymous inner class concepts
	//name of the class implementating Command Line runners -->No name-->as it is Annonymous inner class 
	
	@Bean
	public CommandLineRunner runA() {
		
		
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				System.out.println("Arguments are Hello "+Arrays.asList(args));
				
			}
		};
	}

}
