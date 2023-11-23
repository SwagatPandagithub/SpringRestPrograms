package in.ineuron.ApplicationRunners;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner2 implements ApplicationRunner{
	
	@Value("${Spring.application.name}")
	private String name;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("********during runttime the value can be changed through run configuration arguments**************");
		System.out.println();
		
		
		System.out.println(name);
		
		
		
		System.out.println();
		System.out.println("**********************");
		
	}

}
