package com.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.Data.CourseRepoAddress;
import com.course.Data.CourseRepoPerson;
import com.course.Entity.Address;
import com.course.Entity.Person;
import com.course.dto.PersonDTO;

@Service
public class PersonService {

	@Autowired
	private CourseRepoPerson courserepoperson;

	@Autowired
	private CourseRepoAddress courseRepoAddress;

	public List<Person> getAllPerson() {
		return (List<Person>) courserepoperson.findAll();

	}

	public Person getPersonById(int id) {
		return courserepoperson.findOne(id);
	}

	public void deletePersonById(int id) {
		courserepoperson.delete(id);
	}

	public void addPerson(PersonDTO person) {

		Person personEntity = new Person();
		personEntity.setId(0);
		personEntity.setFname(person.getFname());
		personEntity.setLname(person.getLname());
		personEntity.setAge(person.getAge());

		Address address = courseRepoAddress.findOne(person.getAddressId());
		if (address != null) {
			personEntity.setAddress(address);
		}
		courserepoperson.save(personEntity);

	}
	
}
