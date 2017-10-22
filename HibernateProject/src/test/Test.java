package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Test {

	public static void main(String args[]) {
		Student s = new Student();
		s.setSid(1);
		s.setSname("madhava");
		s.setSemail("madhavaster@gmail.com");
		//student object state is transient
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		sess.save(s);
		//student object is in persistant state
		sess.beginTransaction().commit();
		sess.evict(s);
		//student objects gets deleted from session.
	}
}
