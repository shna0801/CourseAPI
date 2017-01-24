package com.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.course.Entity.Person;
import com.course.dto.PersonDTO;
import com.course.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personservice;

//	@RequestMapping("/homePerson")
//	public ModelAndView homePerson() {
//		ModelAndView mv = new ModelAndView("PersonDTO");
//		return mv;
//	}
	
	@RequestMapping(value = "/person", method = RequestMethod.GET)
	public List<Person> getPerson() {
		return personservice.getAllPerson();
	}

	@RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
	public Person getPersonById(@PathVariable int id) {
		return personservice.getPersonById(id);
	}

	@RequestMapping(value = "/person", method = RequestMethod.POST)
	public void addPerson( @RequestBody PersonDTO person) {
		personservice.addPerson(person);
	}

	@RequestMapping(value = "/person/{id}", method = RequestMethod.DELETE)
	public void deletePersonById(@PathVariable int id) {
		personservice.deletePersonById(id);
	}

}
