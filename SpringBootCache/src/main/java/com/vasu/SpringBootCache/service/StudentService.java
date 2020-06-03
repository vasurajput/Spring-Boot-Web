package com.vasu.SpringBootCache.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import com.vasu.SpringBootCache.dao.StudentDAO;
import com.vasu.SpringBootCache.model.Student;

@Service
@CacheConfig(cacheNames = "studentCache")
public class StudentService {
	private static final Logger logger = LoggerFactory.getLogger(StudentService.class);
	
	@Autowired
	private StudentDAO dao;
	
	@Cacheable(cacheNames  = "studentCache")
	public List<Student> getAllStudent() {
		logger.info("vvv:: getAllStudent calling" );
		return dao.findAll();
	}
	
	@Caching(evict = 
			@CacheEvict(value = "studentCache", allEntries = true))
	public List<Student> deleteById(Long id) {
		logger.info("vvv:: deleteById calling" );
		dao.deleteById(id);
		return dao.findAll();
	}
	
	@CachePut(cacheNames = "studentCache")
	public List<Student> save(Student student){
		dao.save(student);
		return dao.findAll();
		
	}
	
	
	@CacheEvict(value = "studentCache", allEntries = true)
	public void clearCache() {
		logger.info("vvv::  cache has been clear");
	}
}
