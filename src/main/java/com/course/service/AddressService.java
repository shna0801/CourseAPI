package com.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.Data.CourseRepoAddress;
import com.course.Entity.Address;

@Service
public class AddressService {

	@Autowired
	private CourseRepoAddress courserepoaddress;

	public List<Address> getAllAddress() {
		return (List<Address>) courserepoaddress.findAll();

	}

	public Address getAddressById(int id) {
		return courserepoaddress.findOne(id);
	}

	public void deleteAddressById(int id) {
		courserepoaddress.delete(id);
	}

	public void addAddress(Address address) {
		courserepoaddress.save(address);
	}
	
}
