package cs544.exercise8_2;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {
	
	@Autowired
	private StudentDAO studentdao;
	//private static SessionFactory sf = HibernateUtil.getSessionFactory();

	public StudentService(StudentDAO studentdao) {
		super();
		this.studentdao = studentdao;
	}

	public StudentService() {
//		studentdao = new StudentDAO();
	}
	
	@Transactional
	public Student getStudent(long studentid) {
	//	Transaction tx = sf.getCurrentSession().beginTransaction();
		Student student = studentdao.load(studentid);;
		Hibernate.initialize(student.getCourselist());
	//	tx.commit();
		return student;
	}
}
