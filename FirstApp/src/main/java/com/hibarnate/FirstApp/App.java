package com.hibarnate.FirstApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory=new Configuration()
    			.configure("hibernate.cfg.xml")
    			.addAnnotatedClass(Studen.class)
    			.buildSessionFactory();
    	Session session=factory.getCurrentSession();
    	try {
			System.out.println("create Student Object.....");
			Studen thestuden=new Studen("hosam","adam","hosam7asko@gmail,com");
			session.beginTransaction();
			System.out.println("Saving the Student....");
			session.save(thestuden);
			session.getTransaction().commit();
			System.out.println("done!");
		} finally {
			
		}
        
    }
}
