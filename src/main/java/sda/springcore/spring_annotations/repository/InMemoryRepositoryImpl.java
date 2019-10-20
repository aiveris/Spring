package sda.springcore.spring_annotations.repository;

import sda.springcore.spring_annotations.model.Customer;

import java.util.ArrayList;
import java.util.List;

// @Repository("customerRepository")
public class InMemoryRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstname("Petras");
        customer.setLastname("Petraitis");

        customers.add(customer);

        return customers;
    }
}
