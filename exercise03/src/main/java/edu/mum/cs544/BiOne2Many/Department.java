package edu.mum.cs544.BiOne2Many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id @GeneratedValue
	private String id;
	private String name;
	@OneToMany(mappedBy = "department")
	private List<Employee> emps = new ArrayList<Employee>();
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Employee> getEmps() {
		return emps;
	}
	
	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	
	

}
