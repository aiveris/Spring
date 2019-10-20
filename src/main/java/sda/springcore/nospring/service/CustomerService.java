package sda.springcore.nospring.service;

import java.util.List;

import sda.springcore.nospring.model.Customer;

public interface CustomerService {
	List<Customer> findAll();
}