package com.course.Data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.course.Entity.Person;

@Repository
public interface CourseRepoPerson extends CrudRepository<Person, Integer>{
	
	//public List<Food> findAllFood();

}
