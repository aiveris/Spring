package sda.springcore.spring_xml.service;

import sda.springcore.spring_xml.model.Customer;

import java.util.List;

public interface CustomerService {
	List<Customer> findAll();
}