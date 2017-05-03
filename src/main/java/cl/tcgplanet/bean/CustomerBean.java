package cl.tcgplanet.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import cl.tcgplanet.domain.Customer;
import cl.tcgplanet.service.CustomerService;

@ManagedBean
@ViewScoped
public class CustomerBean {
	
//	@Autowired
	@ManagedProperty("#{customerServiceImpl}")
	private CustomerService customerService;

	private List<Customer> customers;
	@PostConstruct
	public void init(){
		customers = customerService.getAllCustomers();
	}
	
	/* ********************************
	 *       GETTERS & SETTERS        *
	 ******************************** */
	public CustomerService getCustomerService() {
		return customerService;
	}
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	public List<Customer> getCustomeres() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
}
