package mum.edu.repo.tvprogram;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mum.edu.entities.tvprogram.TVSeries;

public interface TVSeriesRepository extends CrudRepository<TVSeries, Long> {
	List<TVSeries> findByName(String name);
	List<TVSeries> findByGenre(String genre);
	List<TVSeries> findByRating(int rating);
	List<TVSeries> findAll();
	

}
