package mum.edu.repo.person;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mum.edu.entities.person.Director;

public interface DirectorRepository extends CrudRepository<Director, Long> {
	List<Director> findByName(String name);
	List<Director> findAll();
}
