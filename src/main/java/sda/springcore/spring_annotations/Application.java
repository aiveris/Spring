package sda.springcore.spring_annotations;


import sda.springcore.spring_annotations.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


// Example of fully functional Spring mini-application. The beans are configured in XML file
public class Application {

    public static void main(String[] args) {

        ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext-annotations.xml");

        // Note - we are still coding to the interface, so that we can swap out the implementations (IoC)!
        CustomerService service = appCtx.getBean("customerService", CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstname());
    }
}