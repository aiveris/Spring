package sda.springcore.spring_xml_minimal.repository;

import sda.springcore.spring_xml_minimal.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Jonas");
		customer.setLastname("Jonaitis");
		
		customers.add(customer);
		
		return customers;
	}
}
