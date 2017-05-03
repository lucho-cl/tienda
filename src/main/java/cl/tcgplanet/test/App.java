package cl.tcgplanet.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import cl.tcgplanet.config.ApplicationConfig;
import cl.tcgplanet.domain.Client;
import cl.tcgplanet.service.ClientService;
import cl.tcgplanet.service.HelloWorld;

public class App {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		HelloWorld bean = (HelloWorld) context.getBean("hello");
		bean.printMessage("Spring 4 - Hello World !!!!");
		ClientService clientBean = (ClientService) context.getBean("client");
		List<Client> clientes = clientBean.getAllClients();
		for (Client client : clientes) {
			System.out.println("Hola " + client.getName() + " " + client.getLastName());
		}

		context.close();
	}

}
