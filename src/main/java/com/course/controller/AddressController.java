package com.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.course.Entity.Address;
import com.course.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	private AddressService addressservice;

	@RequestMapping("/getAllAddress")
	public List<Address> getAddress() {
		return addressservice.getAllAddress();
	}

	@RequestMapping("/getAddressById/{id}")
	public Address getAddressById(@PathVariable int id) {
		return addressservice.getAddressById(id);
	}

	@RequestMapping(value = "/addAddress", method = RequestMethod.POST)
	public void addAddress( @RequestBody Address address) { 
		addressservice.addAddress(address);
	}
	
	@RequestMapping("/deleteAddressById/{id}")
	public void deleteAddressById(@PathVariable int id) {
		addressservice.deleteAddressById(id);
	}

}
