package in.grs.main;

import org.hibernate.Session;

import in.grs.util.HibernateUtil;
import in.grs.model.Student;

public class Main {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSession();
		
		Student student = session.get(Student.class, 2);
		System.out.println(student);
		session.close();

	}

}
