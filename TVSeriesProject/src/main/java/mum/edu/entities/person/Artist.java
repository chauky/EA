package mum.edu.entities.person;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Artist")
public class Artist extends Person{
	
	private String castName;

	public Artist() {
	}

	public String getCastName() {
		return castName;
	}

	public void setCastName(String castName) {
		this.castName = castName;
	}
	

}
