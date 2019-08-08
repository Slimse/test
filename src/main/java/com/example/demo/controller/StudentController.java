package com.example.demo.controller;

import com.example.demo.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Class description.
 * <p>
 * Created by matyushin-ka on 08.08.2019.
 */
@RestController
public class StudentController
{
	@Autowired
	StudentRepository studentRepository;

	@RequestMapping(value="/")
	public ModelAndView test(){
		System.out.println("test");
		ModelAndView mvc = new ModelAndView("index");
		mvc.addObject("tes", "1dddddddddd");
		mvc.addObject("x", "123123");
		return mvc;
	}
}
