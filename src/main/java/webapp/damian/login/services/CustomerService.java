package webapp.damian.login.services;

import webapp.damian.login.beans.Customer;

public interface CustomerService {

	public void saveCustomer(Customer customer);
	public Customer loginCustomer(Customer customer);
}
