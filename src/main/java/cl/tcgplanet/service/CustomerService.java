package cl.tcgplanet.service;

import java.util.List;

import cl.tcgplanet.domain.Customer;

public interface CustomerService {
    public Customer getCustomer(Customer customer);
    
    public List<Customer> getAllCustomers();

    public void insertCustomer(Customer customer);

    public void updateCustomer(Customer customer);
    
    public void deleteCustomer(Customer customer);

	public List<Customer> getCustomers(Customer customer);
}
