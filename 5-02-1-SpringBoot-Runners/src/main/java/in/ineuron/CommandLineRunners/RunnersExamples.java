package in.ineuron.CommandLineRunners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class RunnersExamples implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println();
		System.out.println("The Command line Arguments are :: "+Arrays.asList(args));
		System.out.println();
		
	}

}
