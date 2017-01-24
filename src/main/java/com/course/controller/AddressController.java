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

    @RequestMapping(value = "/address", method = RequestMethod.GET)
    public List<Address> getAddress() {
        return addressservice.getAllAddress();
    }

    @RequestMapping(value = "/address/{id}", method = RequestMethod.GET)
    public Address getAddressById(@PathVariable int id) {
        return addressservice.getAddressById(id);
    }

    @RequestMapping(value = "/address", method = RequestMethod.POST)
    public void addAddress(@RequestBody Address address) {
        addressservice.addAddress(address);
    }

    @RequestMapping(value = "/address/{id}", method = RequestMethod.DELETE)
    public void deleteAddressById(@PathVariable int id) {
        addressservice.deleteAddressById(id);
    }

}
