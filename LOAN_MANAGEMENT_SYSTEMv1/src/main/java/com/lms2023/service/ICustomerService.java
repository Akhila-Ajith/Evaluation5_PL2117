package com.lms2023.service;

import java.util.List;

import com.lms2023.model.Customer;

public interface ICustomerService {

	public List<Customer> getCustomer();

		//insert
		public Customer saveCustomer(Customer customer);

}
