package example2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student2;

public class Test {

	public static void main(String[] args) {
		
		Configuration cf = new Configuration();
		cf.configure("resources/oracle.cfg.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Student2 st = new Student2();
		st.setId(101);
		st.setName("madhava");
		st.setEmail("madhavaster@gmail.com");
		
		int pk =(int) session.save(st);
		System.out.println(pk);
		t.commit();
		session.close();
		sf.close();
	}

}
