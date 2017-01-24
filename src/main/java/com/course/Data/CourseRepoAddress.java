package com.course.Data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.course.Entity.Address;

@Repository
public interface CourseRepoAddress extends CrudRepository<Address, Integer>{
	
	//public List<Food> findAllFood();

}
