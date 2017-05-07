package cl.tcgplanet.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import cl.tcgplanet.config.AppConfig;
import cl.tcgplanet.domain.CodeName;
import cl.tcgplanet.domain.Customer;
import cl.tcgplanet.service.CustomerStatusService;
import cl.tcgplanet.service.HelloWorld;
import cl.tcgplanet.service.ProductService;

public class App {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld bean = (HelloWorld) context.getBean("hello");
		bean.printMessage("Spring 4 - Hello World !!!!");
		String[] lista = context.getBeanDefinitionNames();
//		for (int i = 0; i < lista.length; i++) {
//			System.out.println("valor de :" +lista[i]);
//		}
		CustomerStatusService customerStatusService = (CustomerStatusService) context.getBean("customerStatusService");
		ProductService productService = (ProductService) context.getBean("productService");
		List<CodeName> customers = customerStatusService.getAllStatus();
		System.out.println(productService.getAllProducts());
//		System.out.println(customerService.getCustomer(new Customer()));
		for (CodeName customer : customers) {
			System.out.println("Hola " + customer.getLabel() + " " + customer.getValue());
		}
//		for (Customer customer : customers) {
//			System.out.println("Hola " + customer.getName() + " " + customer.getLastName() + " estado: " + customer.getStatus().getValue());
//		}

		context.close();
	}

}
