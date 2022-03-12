package start.spring.jpa.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import start.spring.jpa.demo.beans.VeggieBean;
import start.spring.jpa.demo.entities.Veggies;
import start.spring.jpa.demo.service.VeggieService;

@RestController
@RequestMapping("/veggie")
public class VeggieController {

	@Autowired
//	@Qualifier("vegetable")
	private VeggieService vegetableService;
	
	@Autowired
	@Qualifier("fruit")
	private VeggieService fruitService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void saveNewVeggie(@RequestBody VeggieBean bean) {
		vegetableService.saveNewVeggie(bean);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Veggies> getAllVeggies() {
		return fruitService.getAllVeggies();
	}
	
	
	
}
