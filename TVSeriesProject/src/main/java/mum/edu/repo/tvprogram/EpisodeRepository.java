package mum.edu.repo.tvprogram;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mum.edu.entities.tvprogram.Episode;

public interface EpisodeRepository extends CrudRepository<Episode, Long> {
	
	List<Episode> findAll();

}
