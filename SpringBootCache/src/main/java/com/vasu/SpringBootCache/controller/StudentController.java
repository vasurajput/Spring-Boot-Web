package com.vasu.SpringBootCache.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vasu.SpringBootCache.model.Student;
import com.vasu.SpringBootCache.service.StudentService;

@RestController
public class StudentController {
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public List<Student> getAllStudent() {
		return service.getAllStudent();
	}
	
	@GetMapping("/deleteById/{studentId}")
	public List<Student> deleteById(@PathVariable("studentId") Long studentId) {
		logger.info("vvv::  studentId= "+studentId);
		List<Student> response = service.deleteById(studentId);
		return response;
	}
	
	@GetMapping("/save/{id}/{name}/{email}/{address}")
	public List<Student> saveStudent(@PathVariable("id") Long id,
			@PathVariable("name") String name,
			@PathVariable("email") String email,
			@PathVariable("address") String address) {
		return service.save(new Student(id,name,email,address));
	}
	
	@GetMapping("/clearCache")
	public String clear() {
		service.clearCache();
		return "Cache has been cleared";
	}
}
