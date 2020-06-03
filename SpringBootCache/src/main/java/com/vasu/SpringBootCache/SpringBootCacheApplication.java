package com.vasu.SpringBootCache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import com.vasu.SpringBootCache.dao.StudentDAO;
import com.vasu.SpringBootCache.model.Student;

@EnableCaching
@SpringBootApplication
public class SpringBootCacheApplication implements CommandLineRunner{
	
	@Autowired
	private StudentDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCacheApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (int i=0;i<10;i++) {
			Student student = new Student(i+0L,"name " + i, "emailId " + i, "address "+i);
			dao.save(student);
		}
		
	}

}
