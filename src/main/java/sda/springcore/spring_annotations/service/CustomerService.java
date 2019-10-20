package sda.springcore.spring_annotations.service;

import sda.springcore.spring_annotations.model.Customer;

import java.util.List;

public interface CustomerService {
	List<Customer> findAll();
}