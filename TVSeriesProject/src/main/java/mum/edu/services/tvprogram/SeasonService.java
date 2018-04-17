package mum.edu.services.tvprogram;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.entities.tvprogram.Season;
import mum.edu.repo.tvprogram.SeasonRepository;


@Service
public class SeasonService {
	
	@Autowired
	private SeasonRepository seasonRepo;
	
	public List<Season> getAllSeasons(){
		return seasonRepo.findAll();
	}

}
