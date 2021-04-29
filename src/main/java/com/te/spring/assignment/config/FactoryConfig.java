package com.te.spring.assignment.config;

import javax.persistence.Persistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.te.spring.assignment.bean.EntityManagerFactoryBean;

@Configuration
public class FactoryConfig {

	@Bean
	public EntityManagerFactoryBean getEntitymaEntityManagerFactoryBean() {

		EntityManagerFactoryBean bean = new EntityManagerFactoryBean();
		bean.setFactory(Persistence.createEntityManagerFactory("Movie"));
		return bean;

	}
}
