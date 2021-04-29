package com.te.spring.assignment.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.te.spring.assignment.bean.EntityManagerFactoryBean;
import com.te.spring.assignment.bean.Movie;
import com.te.spring.assignment.config.FactoryConfig;
import com.te.spring.assignment.config.MovieConfig;

public class InsertStatic {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(FactoryConfig.class);

		EntityManagerFactoryBean bean = context.getBean(EntityManagerFactoryBean.class);

		ApplicationContext movieContext = new AnnotationConfigApplicationContext(MovieConfig.class);
		
		Movie movie = movieContext.getBean(Movie.class);
		
		((AbstractApplicationContext) context).close();
		
		((AbstractApplicationContext) movieContext).close();

		EntityManagerFactory factory = bean.getFactory();

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();

		manager.persist(movie);

		transaction.commit();

		System.out.println("successfully inserted one row");
		
	}

}
