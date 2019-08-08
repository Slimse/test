package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Class description.
 * <p>
 * Created by matyushin-ka on 07.08.2019.
 */
@Entity
public class Student
{
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String passportNumber;
}
