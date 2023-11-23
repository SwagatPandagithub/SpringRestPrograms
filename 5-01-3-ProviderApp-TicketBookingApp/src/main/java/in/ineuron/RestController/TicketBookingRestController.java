package in.ineuron.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.Response.Ticket;
import in.ineuron.request.PassengerInfo;

@RestController
@RequestMapping("/api/ticket")
public class TicketBookingRestController {

	@PostMapping("/register")
	public ResponseEntity<Ticket> bookTicket(@RequestBody PassengerInfo passengerInfo) {

		Ticket ticket = new Ticket("1234", "Chart Prepared", "500",
				passengerInfo.getFirstName() + " " + passengerInfo.getLastName(), passengerInfo.getFrom(),
				passengerInfo.getTo(), passengerInfo.getJourneyDate(), passengerInfo.getTrainNumber());

		return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);

	}

}
