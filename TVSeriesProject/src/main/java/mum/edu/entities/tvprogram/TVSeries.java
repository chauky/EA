package mum.edu.entities.tvprogram;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import mum.edu.entities.person.Artist;
import mum.edu.entities.person.Director;

@Entity
public class TVSeries {
	
	@Id @GeneratedValue
	private Long tvId;
	private String name;
	private String genre;
	private int rating;
	private String description;
	private String studio;
	
    @OneToMany()
    @JoinColumn(name="tvSeries_Id")
    private List<Artist> casts = new ArrayList<Artist>();
    
	@OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "director_id")
	private Director director;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch=FetchType.EAGER,mappedBy="series")
	private List<Season> seasons = new ArrayList<Season>();
	
	public Long getTvId() {
		return tvId;
	}

	public void setTvId(Long tvId) {
		this.tvId = tvId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getStudio() {
		return studio;
	}
	
	public void setStudio(String studio) {
		this.studio = studio;
	}
	
	public Director getDirector() {
		return director;
	}
	
	public void setDirector(Director director) {
		this.director = director;
	}
	
	public List<Season> getSeasons() {
		return seasons;
	}
	
	public void addSeason(Season season) {
		seasons.add(season);
		season.setSeries(this);
	}
	
	
	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}
	
}
