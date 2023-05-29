package in.grs.main;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.grs.util.HibernateUtil;
import in.grs.model.Student;

public class Main {

	public static void main(String[] args) {
		
		Session session = null;
		Transaction transaction = null;
		
		while(true) {
			
			boolean flag = false;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the ur choice [1/2]:1->INSERT 2->READ:");
			int choice=sc.nextInt();
		switch (choice) {
		case 1:
			try {
				session = HibernateUtil.getSession();

				if (session != null)
					transaction = session.beginTransaction();

				if (transaction != null) {

					Student student = new Student();
					student.setId(18);
					student.setName("kohli");
					student.setAddress("RCB");
					student.setAge(35);

					session.save(student);
					flag = true;
				}

			} catch (HibernateException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (flag) {
					transaction.commit();
					System.out.println("Object saved to database....");
				} else {
					transaction.rollback();
					System.out.println("Object not saved to database...");
				}

			}
			
			break;
		case 2: 
			Scanner ans=new Scanner(System.in);
			System.out.println("Enter the id u want to search:");
			int result=ans.nextInt();
			int id = result;
			try {
				session = HibernateUtil.getSession();

				if (session != null) {
					Student student = session.load(Student.class, id);

					if (student != null) {
						System.out.println("Student id is      :: " + student.getId());

						System.in.read();

						System.out.println("STUDENT NAME IS    :: " + student.getName());
						System.out.println("STUDENT AGE IS     :: " + student.getAge());
						System.out.println("STUDENT ADDRESS IS :: " + student.getAddress());
					} else
						System.out.println("Record not found for the given id :: " + id);
				}
			} catch (HibernateException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} 
			break;
		default:
			System.out.println("Invalid input ");
			
		}
		HibernateUtil.closeSession(session);
		HibernateUtil.closeSessionFactory();
		}

		}

		}
		
		
		
	
	


