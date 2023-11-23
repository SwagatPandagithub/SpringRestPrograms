package in.ineuron.RestControlller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.ModelResponse.CurrencyResponse;


@RestController
@RequestMapping("/api/currency")
public class CurrencyConverterApp {
	
	@GetMapping("/convert/from/{from}/to/{to}")//http://localhost:9999/api/currency/convert/from/INR/to/USD
	public ResponseEntity<CurrencyResponse> getCurrenencyValue(@PathVariable String from, @PathVariable String to){

		CurrencyResponse response = new CurrencyResponse(1, from, to, 82);
		
		
		return new ResponseEntity<CurrencyResponse>(response,HttpStatus.OK);
	}
	

}
