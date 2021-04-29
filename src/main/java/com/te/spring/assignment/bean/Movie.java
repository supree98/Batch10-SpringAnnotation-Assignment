package com.te.spring.assignment.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Movie {

	@Id
	@Column
	private int mid;
	@Column
	private String mname;
	@Column
	private String mreview;
	@Column
	private double mratings;

}
