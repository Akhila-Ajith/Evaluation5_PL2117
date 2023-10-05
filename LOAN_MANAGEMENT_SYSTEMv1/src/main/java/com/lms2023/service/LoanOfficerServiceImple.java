package com.lms2023.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms2023.model.loanOfficer;
import com.lms2023.repository.ICustomerRepo;
import com.lms2023.repository.ILoanOfficerRepo;
@Service
public class LoanOfficerServiceImple implements ILoanOfficerService {
	@Autowired
	private ILoanOfficerRepo loanOfficerRepo;
	@Override
	public List<loanOfficer> getloanOfficer() {
		// TODO Auto-generated method stub
		return (List<loanOfficer>)loanOfficerRepo.findAll();
	}

}
