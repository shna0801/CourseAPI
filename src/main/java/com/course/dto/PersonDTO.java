package com.course.dto;


public class PersonDTO {

    private String fname;
    private String lname;
    private int age;
    private int addressId;

    public PersonDTO(String fname, String lname, int age, int addressId) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.addressId = addressId;
    }

    public PersonDTO(){

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
}
