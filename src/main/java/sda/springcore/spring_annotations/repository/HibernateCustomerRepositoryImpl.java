package sda.springcore.spring_annotations.repository;

import sda.springcore.spring_annotations.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
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
