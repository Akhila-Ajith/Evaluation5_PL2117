package com.lms2023.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms2023.model.Customer;
import com.lms2023.repository.ICustomerRepo;
@Service
public class CustomerServiceImple implements ICustomerService {
	@Autowired
	private ICustomerRepo customerRepo;

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		 return (List<Customer>)customerRepo.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

}
