package sda.springcore.spring_xml.repository;

import sda.springcore.spring_xml.model.Customer;

import java.util.ArrayList;
import java.util.List;

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
