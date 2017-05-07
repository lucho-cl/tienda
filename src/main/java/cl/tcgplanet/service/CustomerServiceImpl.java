package cl.tcgplanet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.tcgplanet.domain.Customer;
import cl.tcgplanet.persistence.CustomerMapper;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerMapper customerMapper;
	
    public Customer getCustomer(Customer customer){
    	return customerMapper.getCustomer(customer);
    }
    
    public List<Customer> getAllCustomers(){
    	return customerMapper.getAllCustomers();
    }
    
    public List<Customer> getCustomers(Customer customer) {
    	return customerMapper.getCustomers(customer);
    }

    public void insertCustomer(Customer customer){
    	customerMapper.insertCustomer(customer);
    }

    public void updateCustomer(Customer customer){
    	customerMapper.updateCustomer(customer);
    }
    
    public void deleteCustomer(Customer customer){
    	customerMapper.deleteCustomer(customer);
    }
}
