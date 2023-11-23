package in.ineuron.ApplicationRunners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MethodReferenceStyle {
	
	public CommandLineRunner runC() {
		
		//st:- method reference means static method na, so object need not to be created
		
		return MethodRefClass::test;
		
		
		
	}

}
