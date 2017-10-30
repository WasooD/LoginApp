package webapp.damian.login.services;

import org.springframework.beans.factory.annotation.Autowired;

import webapp.damian.login.beans.Customer;
import webapp.damian.login.dao.CustomerDao;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
	}

	@Override
	public Customer loginCustomer(Customer customer) {
		return customerDao.loginCustomer(customer);
	}
}
