package crudexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student2;

public class TestGetLoad {

	public static void main(String[] args) {

		Configuration cf = new Configuration();
		cf.configure("resources/oracle2.cfg.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session session = sf.openSession();
		
		Student2 st = (Student2)session.get(Student2.class, 101);
		System.out.println("madhava>>>>"+st.getName());
		session.close();
		sf.close();
	}

}
