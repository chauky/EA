package mum.edu.controllers;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.entities.person.Address;
import mum.edu.entities.person.Artist;
import mum.edu.entities.person.Director;
import mum.edu.entities.tvprogram.Episode;
import mum.edu.entities.tvprogram.Season;
import mum.edu.entities.tvprogram.TVSeries;
import mum.edu.services.tvprogram.TVSeriesService;

@Controller
public class HomeController {
	
	@Autowired
	TVSeriesService tvservice;
	
	@RequestMapping(value = { "/", "/index", "/home" }, method = RequestMethod.GET)
    public String index(Model model) {
        List<TVSeries> listTVProgram = tvservice.getAllTVSeries();
        model.addAttribute("listTVPrograms", listTVProgram);
   //     TestData();
        System.out.println("================================================"+listTVProgram);
        return "ListTVProgram";
    }
	

	public void TestData() {
		TVSeries tvSer = new TVSeries();
		
		//Set Address
		Address address = new Address();
        address.setCity("Spring");
        address.setState("Texas");
        address.setStreet("1234 street");
        address.setZipCode("23423");
        
        //Set Cast/Artist
        Artist cast1 = new Artist();
        cast1.setBiography("Test cast artist 1");
        cast1.setDateOfBirth(new Date(1889, 1, 23));
        cast1.setName("Chau Ky");
        cast1.setPlaceOfBirth(address);
        
        //Set Director
        Director director = new Director();
        director.setBiography("I am cast 1");
        director.setDateOfBirth(new Date(1981, 11, 01));
        director.setName("Jacky");
        director.setPlaceOfBirth(address);

        
        //Set Episode
        Episode episode1 = new Episode();
        episode1.setName("Episode 1");
        episode1.setDescription("This is test description 1");
        episode1.setAirDate(new Date());
        
        
        //Set season
        Season season1 = new Season();
        season1.setSummary("test seasion 1");
        season1.setYear(2017);  
        season1.addEpisode(episode1);


        //Data for TV Series
        tvSer.setName("TV Series Test");
        tvSer.setGenre("Action");
        tvSer.setRating(4);
        tvSer.setDescription("The TV Series Test description");
        tvSer.setStudio("Test Studio");
        tvSer.setDirector(director);
        tvSer.addSeason(season1);
        
        //Persist data
        tvservice.Save(tvSer);
	}
}

