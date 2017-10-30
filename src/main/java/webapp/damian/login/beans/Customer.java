package webapp.damian.login.beans;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	
	@NotEmpty
	@Column
	private String customerName;
	
	@NotEmpty
	@Column
	private String customerMobile;
	
	@NotEmpty
	@Column
	private String customerGender;
	
	@NotEmpty
	@Column
	private String customerMail;
	
	@NotEmpty
	@Column
	private String customerPassword;
	
	
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerMobile() {
		return customerMobile;
	}
	
	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}
	
	public String getCustomerGender() {
		return customerGender;
	}
	
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	
	public String getCustomerMail() {
		return customerMail;
	}
	
	public void setCustomerMail(String customerMail) {
		this.customerMail = customerMail;
	}
	
	public String getCustomerPassword() {
		return customerPassword;
	}
	
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
}
