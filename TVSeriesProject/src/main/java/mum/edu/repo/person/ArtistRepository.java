package mum.edu.repo.person;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mum.edu.entities.person.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Long>{
	List<Artist> findByName(String name);
	List<Artist> findAll();
	List<Artist> findByCastName(String castName);

}
