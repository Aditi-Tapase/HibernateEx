package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {
public static void main(String[] args) {
	System.out.println(1);
	Configuration cfg=new Configuration();
	// System.out.println(2);
	cfg.configure(); // checks the hibernate.cfg.xml
	// System.out.println(3);
	cfg.addAnnotatedClass(Mobile.class);
	SessionFactory factory=cfg.buildSessionFactory();
	// System.out.println(4);
	Session session=factory.openSession();
	// System.out.println(5);
	
    Mobile mobile=session.load(Mobile.class,1);
    
    Mobile mobile2=session.get(Mobile.class,2);
    
    Mobile mobile3=session.find(Mobile.class,1);
    System.out.println(mobile);
    System.out.println(mobile2);
    System.out.println(mobile3);
    
    // insert into mobile values(?,?,?)
//    Mobile mobile4=new Mobile(4,"Motorola", 25000);
//    session.save(mobile4);
//    session.beginTransaction().commit();
   
    //update
//    Mobile mb=new Mobile(4,"hawai",40000);
//    session.update(mb);
//    session.beginTransaction().commit();
    
    //saveorUpdate
//    Mobile mb=new Mobile(5,"Nokia",46000);
//    session.saveOrUpdate(mb);
//    session.beginTransaction().commit();
    
    //delete
    Mobile mb=new Mobile(4);
    session.delete(mb);
    session.beginTransaction().commit();
    
    
}
}
