package com.course.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {

	private int id;
	private String fname;
	private String lname;
	private int age;
	private int addressId;
	private Address address;

	public Person() {

	}

	public Person(String fname, String lname, int age, Address address, int addressId) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.address = address;
		this.setAddressId(addressId);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="addressId")
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getAddressId() {
		return address.getId();
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

}
