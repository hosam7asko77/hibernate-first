package com.hibarnate.FirstApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class ReadStudentDemo 
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
			Studen thestuden=new Studen("daffy","duck","daffy@gmail,com");
			session.beginTransaction();
			System.out.println("Saving the Student....");
			System.out.println(thestuden);
			session.save(thestuden);
			session.getTransaction().commit();
			//find out student by using primary key
			System.out.println("saved student and generated id"+thestuden.getId());
			
			//create new session and start transaction 
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			
			//retrieve the student based on the id 
			System.out.println("\n Geting Student By Id "+thestuden.getId());
			Studen mystudent=session.get(Studen.class,thestuden.getId());
			System.out.println("get complete"+mystudent);
			
			
			//commit transaction
			session.getTransaction().commit();
			
			
			
			System.out.println("done!");
		} finally {
			
		}
        
    }
}
