package sda.springcore.spring_xml;


import sda.springcore.spring_xml.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// xml configuration
public class Application {

    public static void main(String[] args) {
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext-xml.xml");
        CustomerService service = appCtx.getBean("customerService", CustomerService.class);
        System.out.println(service.findAll().get(0).getFirstname());
    }
}

// // bean scopes
// public class Application {
//
//     public static void main(String[] args) {
//         ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext-xml.xml");
//
//         // Note - we are still coding to the interface, so that we can swap out the implementations (IoC)!
//         CustomerService service = appCtx.getBean("customerService", CustomerService.class);
//         CustomerService service2 = appCtx.getBean("customerService", CustomerService.class);
//         System.out.println(service);
//         System.out.println(service2);
//     }
// }

// // property files
// public class Application {
//
//     public static void main(String[] args) {
//
//         ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext-xml.xml");
//         CustomerService service = appCtx.getBean("customerService", CustomerService.class);
//
//         System.out.println(service.findAll().get(0).getFirstname());
//         // Properties file demo
//         System.out.println(service.findAll().get(0).getLastname());
//     }
// }