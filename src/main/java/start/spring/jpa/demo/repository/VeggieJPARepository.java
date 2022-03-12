package start.spring.jpa.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import start.spring.jpa.demo.entities.Veggies;

@Transactional
@Repository
public interface VeggieJPARepository extends JpaRepository<Veggies, Integer> {

}
