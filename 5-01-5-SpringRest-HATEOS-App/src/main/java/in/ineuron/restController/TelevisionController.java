package in.ineuron.restController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.Model.Television;

@RestController
@RequestMapping("/api/tv")
public class TelevisionController {

	@GetMapping("/gettv/{brand}")
	public ResponseEntity<Television> getBook(@PathVariable("brand") String brand) {

		Television tv = new Television(brand, "line", "43", "50000");
		
		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(TelevisionController.class).getAllTvs())
				.withRel("AllTelevisions");
		
		tv.add(link);

		return new ResponseEntity<Television>(tv, HttpStatus.OK);
	}
	@GetMapping("/getAlltv")
	public List<Television> getAllTvs() {

		List<Television> list = new ArrayList<Television>();

		list.add(new Television("LG", "line", "50", "60000"));
		list.add(new Television("Redmi", "Square", "32", "80000"));
		list.add(new Television("Haier", "Curve", "43", "20000"));
		list.add(new Television("Samsung", "Circle", "40", "40000"));

		return list;

	}

}
