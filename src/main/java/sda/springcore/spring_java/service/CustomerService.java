package sda.springcore.spring_java.service;

import sda.springcore.spring_java.model.Customer;

import java.util.List;

public interface CustomerService {
	List<Customer> findAll();
}