package com.techlabs.flims.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techlabs.flims.Actor;
import com.techlabs.flims.Movies;

public class Test {
	private static Configuration conf = new Configuration();
	private static SessionFactory factory = conf.configure("hibernate.cfg.xml")
			.buildSessionFactory();

	public static void main(String[] args) {
		
		Session sesion=factory.openSession();
		org.hibernate.Transaction trans=null;
		
		Actor actor1=new Actor();
		actor1.setName("Ranbir");
		
		Actor actor2=new Actor();
		actor2.setName("Varun");
		
		Set<Actor> actors=new HashSet<Actor>();
		actors.add(actor1);
		actors.add(actor2);
		
		Movies movie=new Movies();
		movie.setType("Action");
		movie.setName("MI");
		
		
		Movies movie1=new Movies();
		movie1.setType("Action");
		movie1.setName("pirates");
		
		Movies movie2=new Movies();
		movie2.setType("Romance");
		movie2.setName("Titanic");
		
		Set<Movies> movies = new HashSet<>();
		movies.add(movie);
		movies.add(movie1);
		movies.add(movie2);
		
		
		actor1.getMovies().add(movie);
		actor2.getMovies().add(movie);
		
		actor1.getMovies().add(movie1);
		actor2.getMovies().add(movie2);
		
		try{
			trans=sesion.beginTransaction();
			sesion.save(actors);
			trans.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
			trans.rollback();
			
		}finally{
			sesion.close();
		}
		
	}
}
