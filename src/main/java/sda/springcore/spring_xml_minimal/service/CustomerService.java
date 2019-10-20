package sda.springcore.spring_xml_minimal.service;

import sda.springcore.spring_xml_minimal.model.Customer;

import java.util.List;

public interface CustomerService {
	List<Customer> findAll();
}