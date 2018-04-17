package mum.edu.entities.tvprogram;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import mum.edu.entities.person.Artist;

@Entity
public class Episode {
	
	@Id @GeneratedValue
	private Long id;
	private String name;
	private Date airDate;
	private String description;
	
	@ManyToOne
	@JoinColumn(name="season_Id")
	private Season season;
	//private Map<String, Artist> cast = new HashMap<>();
	
	public Episode() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getAirDate() {
		return airDate;
	}
	
	public void setAirDate(Date airDate) {
		this.airDate = airDate;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Season getSesson() {
		return season;
	}
	
	public void setSesson(Season season) {
		this.season = season;
	}
	
	@Override
	public String toString() {
		return "Episode [name=" + name + ", airDate=" + airDate + ", description=" + description + ", sesson=" + season
				+ "]";
	}
	
	
	
}
