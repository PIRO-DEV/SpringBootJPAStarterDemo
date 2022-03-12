package start.spring.jpa.demo.service;

import java.util.List;

import start.spring.jpa.demo.beans.VeggieBean;
import start.spring.jpa.demo.entities.Veggies;

public interface VeggieService {
	
	void saveNewVeggie(VeggieBean bean);
	List<Veggies> getAllVeggies();

}
