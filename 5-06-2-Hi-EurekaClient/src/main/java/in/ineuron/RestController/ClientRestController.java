package in.ineuron.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.feignClient.HelloClient;

@RestController
public class ClientRestController {
	
	@Autowired
	private HelloClient client;
	
	@GetMapping("/hi/{name}")
	public String sayHiee(@PathVariable("name") String name) {
		
		System.out.println("The implementaion class of the client interface is "+client.getClass().getName());
		
		String msg="hiee     -";
		
		String helloMsg = client.invokeHelloService(name);
		
		return msg +"    -------    "+helloMsg+"      "+ name+"       How are you??!!";
	}

}
