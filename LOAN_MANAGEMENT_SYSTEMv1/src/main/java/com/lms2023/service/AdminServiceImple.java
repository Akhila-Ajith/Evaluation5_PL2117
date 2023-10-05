package com.lms2023.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms2023.model.Customer;
import com.lms2023.repository.IAdminRepo;

@Service
public class AdminServiceImple implements IAdminService {
	@Autowired
	private IAdminRepo adminRepo;

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return adminRepo.save(customer);
		
	}


}
