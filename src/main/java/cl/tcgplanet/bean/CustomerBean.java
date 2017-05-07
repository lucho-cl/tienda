package cl.tcgplanet.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import cl.tcgplanet.domain.CodeName;
import cl.tcgplanet.domain.Customer;
import cl.tcgplanet.service.CustomerService;
import cl.tcgplanet.service.CustomerStatusService;

@ManagedBean
@ViewScoped
public class CustomerBean {

	@ManagedProperty("#{customerService}")
	private CustomerService customerService;
	@ManagedProperty("#{customerStatusService}")
	private CustomerStatusService customerStatusService;
	private List<Customer> customers;
	private List<CodeName> statusList;

	private Customer newCustomer;
	private Customer customer;

	@PostConstruct
	public void init() {
		clean();
		statusList = customerStatusService.getAllStatus();
	}

	private void clean() {
		newCustomer = new Customer();
		customer = new Customer();
		customers = customerService.getAllCustomers();
	}

	public List<Customer> completeByEmail(String query) {
		List<Customer> results = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setEmail(query);
		results = customerService.getCustomers(customer);

		return results;
	}

	public void addCustomer(ActionEvent event) {
		clean();
	}
	
	public void createCustomer() {
		CodeName status = new CodeName();
		status.setLabel("1");
		newCustomer.setStatus(status);
		newCustomer.setRegistered(LocalDate.now());
		customerService.insertCustomer(newCustomer);
		clean();
	}

	/*
	 * ******************************** GETTERS & SETTERS *
	 */
	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public CustomerStatusService getCustomerStatusService() {
		return customerStatusService;
	}

	public void setCustomerStatusService(CustomerStatusService customerStatusService) {
		this.customerStatusService = customerStatusService;
	}

	public List<CodeName> getStatusList() {
		return statusList;
	}

	public void setStatusList(List<CodeName> statusList) {
		this.statusList = statusList;
	}

	public Customer getNewCustomer() {
		return newCustomer;
	}

	public void setNewCustomer(Customer newCustomer) {
		this.newCustomer = newCustomer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
