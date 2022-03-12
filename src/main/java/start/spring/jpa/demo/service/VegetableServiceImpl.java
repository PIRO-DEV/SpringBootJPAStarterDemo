package start.spring.jpa.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import start.spring.jpa.demo.beans.VeggieBean;
import start.spring.jpa.demo.entities.Veggies;
import start.spring.jpa.demo.repository.VeggieJPARepository;

@Service("vegetable")
@Primary
public class VegetableServiceImpl implements VeggieService {

	@Autowired
	private VeggieJPARepository repo;

	@Override
	public void saveNewVeggie(VeggieBean yachi) {
		Veggies entity = new Veggies();
		entity.setItemName(yachi.getVeggieName());
		entity.setVeggieType(yachi.getVeggieType());
		entity.setUnitCost(yachi.getUnitCost());
		entity.setPrefferedUnit(yachi.getPrefferedUnit());
		repo.save(entity);
	}
	
	@Override
	public List<Veggies> getAllVeggies() {
		return repo.findAll();
	}
	
	
	
}
