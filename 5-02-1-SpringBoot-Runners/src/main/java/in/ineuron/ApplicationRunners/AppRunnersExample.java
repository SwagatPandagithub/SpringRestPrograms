package in.ineuron.ApplicationRunners;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunnersExample implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
			
		
		System.out.println();
		//Printing args in the form of arrays
		System.out.println("Application Runners are :: "+Arrays.asList(args.getSourceArgs()));
		
		//Printing Optional Arguments 
		System.out.println("Optional arguments are :: "+args.getOptionNames());
		
		//Printing Non-Option Args
		System.out.println("Non-Optional Arguments are :: "+args.getNonOptionArgs());
		System.out.println();
		
		
		if(args.getNonOptionArgs().contains("start"))
				System.out.println("Start Taking email dumps");
	}

}
