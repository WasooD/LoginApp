package webapp.damian.login.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import webapp.damian.login.beans.Customer;
import webapp.damian.login.services.CustomerService;
import webapp.damian.login.validation.CustomerValidation;

@Controller
@RequestMapping(value="/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showForm (ModelMap model) {
		model.put("customerData", new Customer());
		return "register/register";
	}
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String saveForm (ModelMap model, @ModelAttribute("customerData") @Valid Customer customer, BindingResult bindingResult, HttpSession session) {
		CustomerValidation customerValidation = new CustomerValidation();
		customerValidation.validate(customerValidation, bindingResult);
		if (bindingResult.hasErrors()) {
			return "register/register";
		} else {
			customerService.saveCustomer(customer);
			session.setAttribute("customer", customer);
			return "redirect:success";
		}
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin(ModelMap model, HttpSession session) {
		if (session.getAttribute("customer") == null) {
			model.put("customerData", new Customer());
			return "login/login";
		} else {
			return "redirect:success";
		}
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String doLogin(ModelMap model, @ModelAttribute("customerData") Customer customer, HttpSession session) {
		
		if (customer.getCustomerMail() != null && customer.getCustomerPassword() != null && session.getAttribute("customer") == null) {
			customer = customerService.loginCustomer(customer);
			if (customer != null) {
				session.setAttribute("customer", customer);
				return "redirect:success";
			} else {
				model.put("failed", "Login failed");
				return "login/login";
			}
		} else {
			return "redirect:success";
		}
	}
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logOut(ModelMap model, HttpSession session) {
		session.removeAttribute("customer");
		return "redirect:login";
	}
	
	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String showSuccess(ModelMap model) {
		model.put("success", new Customer());
		return "success";
	}
}
