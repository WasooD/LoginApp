package webapp.damian.login.dao;

import webapp.damian.login.beans.Customer;

public interface CustomerDao {
	
	public void saveCustomer(Customer customer);
	public Customer loginCustomer(Customer customer);
}
