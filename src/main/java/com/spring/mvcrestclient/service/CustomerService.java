package com.spring.mvcrestclient.service;

import java.util.List;

import com.spring.mvcrestclient.model.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
