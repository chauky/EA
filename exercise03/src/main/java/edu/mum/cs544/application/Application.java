package edu.mum.cs544.application;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.mum.cs544.BiOne2Many.Department;
import edu.mum.cs544.BiOne2Many.Employee;



public class Application {
	private static EntityManagerFactory emf;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("cs544");
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static void main(String[] args) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			// Create new instance of Car and set values to it

			// --- ONE TO MANY BIDIRECTIONAL ---
			
			// --------------------------------------------------
			// STORE OBJECTS
			// --------------------------------------------------

			tx.begin();
			// save 
			
			Employee emp1 = new Employee();
			emp1.setEmpNum(1234);
			emp1.setName("Chau Ky");
			
			Employee emp2 = new Employee();
			emp2.setEmpNum(5678);
			emp2.setName("Ky Nguyen");
			
			List<Employee> emps = new ArrayList<Employee>();
			emps.add(emp1);
			emps.add(emp2);
			
			Department biDepartment = new Department();
			biDepartment.setId("Dep01");
			biDepartment.setName("CS");
			biDepartment.setEmps(emps);
			
			em.persist(biDepartment);
			
			
			tx.commit();
			output("Display value : " 
					+ "\n\tBidirectional One to Many Department ID    : " + biDepartment.getId()
					+ "\n\tBidirectional One to Many Department Name: " + biDepartment.getName()
					);

		} catch (Throwable e) {
			System.err.println(e);
			if ((tx != null) && (tx.isActive())) tx.rollback();
		} finally {
			if ((em != null) && (em.isOpen())) em.close();
		}

		if (emf.isOpen()) {
			emf.close();
		}
	}

	private static void output(String output) {
		System.out.println("================= OUTPUT =================");
		System.out.println(output);
		System.out.println("==========================================");
	}
}
