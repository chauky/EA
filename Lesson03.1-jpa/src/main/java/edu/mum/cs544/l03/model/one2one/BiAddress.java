package edu.mum.cs544.l03.model.one2one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BiAddress {
	@Id
	@GeneratedValue
	private int id;
	private String street;
	private String city;
	private String state;
	private String zip;
	@OneToOne(mappedBy = "address")
	private BiPerson person;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public BiPerson getPerson() {
		return person;
	}

	public void setPerson(BiPerson person) {
		this.person = person;
	}
	
	
}
