package sda.springcore.spring_xml.repository;

import sda.springcore.spring_xml.model.Customer;

import java.util.List;

public interface CustomerRepository {
	List<Customer> findAll();
}