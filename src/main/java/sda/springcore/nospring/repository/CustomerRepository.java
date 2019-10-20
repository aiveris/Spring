package sda.springcore.nospring.repository;

import java.util.List;

import sda.springcore.nospring.model.Customer;

public interface CustomerRepository {
	List<Customer> findAll();
}