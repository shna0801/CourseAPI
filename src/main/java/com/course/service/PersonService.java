package com.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.Data.CourseRepoPerson;
import com.course.Entity.Person;

@Service
public class PersonService {

	@Autowired
	private CourseRepoPerson courserepoperson;

	public List<Person> getAllPerson() {
		return (List<Person>) courserepoperson.findAll();

	}

	public Person getPersonById(int id) {
		return courserepoperson.findOne(id);
	}

	public void deletePersonById(int id) {
		courserepoperson.delete(id);
	}

	public void addPerson(Person person) {
		courserepoperson.save(person);
	}
	
}
