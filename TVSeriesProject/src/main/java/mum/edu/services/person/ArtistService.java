package mum.edu.services.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.entities.person.Artist;
import mum.edu.repo.person.ArtistRepository;

@Service
public class ArtistService {
	
	@Autowired
	private ArtistRepository artistRepo;
	
	public List<Artist> findByName(String name){
		return artistRepo.findByName(name);
	}

	public List<Artist> findByCastName(String castName){
		return artistRepo.findByCastName(castName);
	}
	
	public List<Artist> getAllArtists(){
		return artistRepo.findAll();
	}

}
