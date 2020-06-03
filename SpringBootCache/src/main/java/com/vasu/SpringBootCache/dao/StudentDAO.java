package com.vasu.SpringBootCache.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vasu.SpringBootCache.model.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student, Long>{

}
