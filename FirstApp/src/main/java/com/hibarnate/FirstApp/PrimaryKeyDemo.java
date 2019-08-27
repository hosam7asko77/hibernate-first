package com.hibarnate.FirstApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
    			.configure("hibernate.cfg.xml")
    			.addAnnotatedClass(Studen.class)
    			.buildSessionFactory();
    	Session session=factory.getCurrentSession();
    	try {
			System.out.println("create 3 Student Object.....");
			Studen thestuden1=new Studen("ahmed","mohame","ahmed@gmail,com");
			Studen thestuden2=new Studen("amged","musa","amfed@gmail,com");
			Studen thestuden3=new Studen("yosaf","baraka","yosaf@gmail,com");

			
			session.beginTransaction();
			System.out.println("Saving the Students....");
			session.save(thestuden1);
			session.save(thestuden2);
			session.save(thestuden3);
			session.getTransaction().commit();
			System.out.println("done!");
		} finally {
			
		}
	}

}
