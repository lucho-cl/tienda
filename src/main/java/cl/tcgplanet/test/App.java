package cl.tcgplanet.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import cl.tcgplanet.config.AppConfig;
import cl.tcgplanet.domain.Customer;
import cl.tcgplanet.service.CustomerService;
import cl.tcgplanet.service.HelloWorld;
import cl.tcgplanet.service.ProductService;

public class App {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld bean = (HelloWorld) context.getBean("hello");
		bean.printMessage("Spring 4 - Hello World !!!!");
		String[] lista = context.getBeanDefinitionNames();
		for (int i = 0; i < lista.length; i++) {
			System.out.println("valor de :" +lista[i]);
		}
		CustomerService customerService = (CustomerService) context.getBean("customerService");
		ProductService productService = (ProductService) context.getBean("productService");
		List<Customer> customers = customerService.getAllCustomers();
		System.out.println(productService.getAllProducts());
//		System.out.println(customerService.getCustomer(new Customer()));
		for (Customer customer : customers) {
			System.out.println("Hola " + customer.getName() + " " + customer.getLastName() + " estado: " + customer.getStatus().getName());
		}

		context.close();
	}

}
