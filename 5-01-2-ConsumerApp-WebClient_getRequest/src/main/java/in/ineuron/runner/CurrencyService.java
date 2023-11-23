package in.ineuron.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ineuron.ModelResponse.Currency;


@Service("service")
public class CurrencyService {

	
	private static final String Rest_End_Point="http://localhost:9999/api/currency/convert/from/{from}/to/{to}";
	
	
	
	public void invokeRestApiSync(String from, String to) throws Exception {
		// TODO Auto-generated method stub

		
		WebClient webclient = WebClient.create();
		System.out.println("*****Synchronous Call Started*****");
		Currency response = webclient.
												get().
												uri(Rest_End_Point, from, to).
												accept(MediaType.APPLICATION_JSON).
												retrieve().
												bodyToMono(Currency.class).
												block();
		
		System.out.println(response);
		System.out.println("***************** Synchronous Call Ended**************");
		
	}
	
	public void invokeRestApiASynchronous(String from, String to) throws Exception {
		// TODO Auto-generated method stub

		
		WebClient webclient = WebClient.create();
		System.out.println("*****ASynchronous Call Started*****");
		webclient.
				get().
				uri(Rest_End_Point, from, to).
				accept(MediaType.APPLICATION_JSON).
				retrieve().
				bodyToMono(Currency.class).
				subscribe(CurrencyService::myResponse);
		
		System.out.println("*****************ASynchronous Call Ended**************");
		
	}
	
	public static void myResponse(Currency currency) {
		System.out.println(currency);
	}

	
}
