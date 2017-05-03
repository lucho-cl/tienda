package cl.tcgplanet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.tcgplanet.domain.Customer;
import cl.tcgplanet.persistence.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private	CustomerMapper customerMapper;
	
	public Customer getCustomer(Customer customer) {
		return getCustomerMapper().getCustomer(customer);
	}

	public List<Customer> getAllCustomers() {
		return getCustomerMapper().getAllCustomers();
	}

	public void insertCustomer(Customer customer) {
		getCustomerMapper().insertCustomer(customer);
	}

	public void updateCustomer(Customer customer) {
		getCustomerMapper().updateCustomer(customer);
	}

	public void deleteCustomer(Customer customer) {
		getCustomerMapper().deleteCustomer(customer);
	}

	public CustomerMapper getCustomerMapper() {
		return customerMapper;
	}
	public void setCustomerMapper(CustomerMapper customerMapper) {
		this.customerMapper = customerMapper;
	}
}
