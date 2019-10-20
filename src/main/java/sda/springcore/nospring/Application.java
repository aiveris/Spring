package sda.springcore.nospring;


import sda.springcore.nospring.service.CustomerService;
import sda.springcore.nospring.service.CustomerServiceImpl;

public class Application {

    public static void main(String[] args) {
        CustomerService service = new CustomerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstname());
    }
}