package sda.springcore.spring_java.repository;

import sda.springcore.spring_java.model.Customer;

import java.util.List;

public interface CustomerRepository {
	List<Customer> findAll();
}