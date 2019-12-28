package com.spring.login.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.spring.login.model.Login;
import com.spring.login.model.User;

public class UserDaoImpl implements userDao {

	
	//for inserting the user details into the table using hibernate
	
	public void registerUser(User user) {
		SessionFactory sf=new Configuration().configure("hibernate1.cfg.xml").buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		if(user!=null)
		{
			session.save(user);
			tx.commit();
			session.close();
		}
	}
	
	//for checking whether the user is valid or not
	
	public User loginCheck(Login login)
	{
		SessionFactory sf=new Configuration().configure("hibernate1.cfg.xml").buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		String check="";
		
		Query query=session.createQuery("from User");

		List<User> result=query.list();
		
		boolean res=false;
		for(User object : result) {
			
			if(object.getUsername().equals(login.getUsername()) && object.getPassword().equals(login.getPassword())){
				
				System.out.println("Login Success");
				res=true;
				break;
			}
			else {
				System.out.println("Invalid user");
			}
			
		}

		tx.commit();
		session.close();
		if(res==true)
			return result.size() > 0 ? result.get(0) : null;
		else
			return null;
		
	}
}
