package in.ineuron.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.ineuron.Response.Ticket;
import in.ineuron.request.PassengerInfo;

@Service("service")
public class ERailClientApp {

	
	public void invokeRestApi() {

		WebClient webclient = WebClient.create();
		String Rest_Endpoint_URL = "http://localhost:9999/api/ticket/register";

		PassengerInfo body = new PassengerInfo();
		body.setFirstName("swagat Sekhar");
		body.setLastName("panda");
		body.setFrom("Bengaluru");
		body.setTo("Pune");
		body.setJourneyDate("25th Aug");
		body.setTrainNumber("11019- BBS CSMT konark Express");

		Ticket response = webclient.
								post().uri(Rest_Endpoint_URL).//stating it is post method
								accept(MediaType.APPLICATION_JSON).//Sending and recieving the JSON data
								body(BodyInserters.fromValue(body)).//putting the passenger data into body of request object
								retrieve().//then retrive the Json data from the provider
								bodyToMono(Ticket.class).//bind it to ticket class object
								block();//block to have a synchronous call
		
		System.out.println(response);
	}

}
