package com.te.spring.assignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.spring.assignment.bean.Movie;

@Configuration
public class MovieConfig {

	@Bean
	public Movie getMovie() {
		
		Movie movie = new Movie();
		movie.setMid(60);
		movie.setMname("Conjuring");
		movie.setMreview("Excellent");
		movie.setMratings(4.6);
		return movie;
		
	}
	
}
