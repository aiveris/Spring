package sda.springcore.nospring.service;

import java.util.List;

import sda.springcore.nospring.model.Customer;
import sda.springcore.nospring.repository.CustomerRepository;
import sda.springcore.nospring.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}