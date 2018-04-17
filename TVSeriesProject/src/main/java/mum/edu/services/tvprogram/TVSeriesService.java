package mum.edu.services.tvprogram;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.entities.tvprogram.TVSeries;
import mum.edu.repo.tvprogram.TVSeriesRepository;

@Service
public class TVSeriesService {
	
	@Autowired
	private TVSeriesRepository tvSeriesRepo;
	
	public List<TVSeries> findByName(String name){
		return tvSeriesRepo.findByName(name);
	}
	
	public List<TVSeries> findByGenre(String genre){
		return tvSeriesRepo.findByGenre(genre);
	}
	
	public List<TVSeries> findByRating(int rating){
		return tvSeriesRepo.findByRating(rating);
	}
	
	public List<TVSeries> getAllTVSeries(){
		return tvSeriesRepo.findAll();
	}
	
	public void Save(TVSeries tvSeries) {
		tvSeriesRepo.save(tvSeries);
	}
}
