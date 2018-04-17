package mum.edu.repo.tvprogram;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mum.edu.entities.tvprogram.Season;

public interface SeasonRepository extends CrudRepository<Season, Long>{
	List<Season> findAll();
}
