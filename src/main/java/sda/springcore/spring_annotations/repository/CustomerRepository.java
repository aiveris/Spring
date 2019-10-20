package sda.springcore.spring_annotations.repository;

import sda.springcore.spring_annotations.model.Customer;

import java.util.List;

public interface CustomerRepository {
	List<Customer> findAll();
}