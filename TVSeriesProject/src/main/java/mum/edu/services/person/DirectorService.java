package mum.edu.services.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.entities.person.Director;
import mum.edu.repo.person.DirectorRepository;

@Service
public class DirectorService {
	
	@Autowired
	private DirectorRepository directorRepo;
	
	public List<Director> findByName(String name){
		return directorRepo.findByName(name);
	}

	public List<Director> getAllArtists(){
		return directorRepo.findAll();
	}

}
