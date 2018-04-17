package mum.edu.entities.tvprogram;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Season {
	
	@Id @GeneratedValue
	private Long seasonId;
	private byte[] poster;
	private String summary;
	private int year;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch=FetchType.EAGER,mappedBy="season")
	private List<Episode> episodes = new ArrayList<Episode>();
	
	@ManyToOne
	@JoinColumn(name ="TVSeries_Id")
	private TVSeries series;

	public Season() {
	}

	public Long getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(Long seasonId) {
		this.seasonId = seasonId;
	}

	public byte[] getPoster() {
		return poster;
	}
	
	public void setPoster(byte[] poster) {
		this.poster = poster;
	}
	
	public String getSummary() {
		return summary;
	}
	
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public List<Episode> getEpisodes() {
		return episodes;
	}

    public void addEpisode(Episode episode) {
        episodes.add(episode);
        episode.setSesson(this);
    }
    
	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}
	
	public TVSeries getSeries() {
		return series;
	}

	public void setSeries(TVSeries series) {
		this.series = series;
	}
	
}
