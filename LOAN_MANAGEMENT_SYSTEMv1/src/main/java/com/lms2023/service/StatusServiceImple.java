package com.lms2023.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms2023.model.Status;
import com.lms2023.model.loanOfficer;
import com.lms2023.repository.ILoanOfficerRepo;
import com.lms2023.repository.IStatusRepo;

@Service
public class StatusServiceImple implements IStatusService {
	@Autowired
	private IStatusRepo statusRepo;
	@Override
	public List<Status> getStatus() {
		// TODO Auto-generated method stub
		return (List<Status>)statusRepo.findAll();
	}


}
