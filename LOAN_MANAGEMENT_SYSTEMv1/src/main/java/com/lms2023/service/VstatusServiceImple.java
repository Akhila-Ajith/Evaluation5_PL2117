package com.lms2023.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms2023.model.Status;
import com.lms2023.model.VerificationStatus;
import com.lms2023.repository.IStatusRepo;
import com.lms2023.repository.IvStatusRepo;
@Service
public class VstatusServiceImple implements IvStatusService {
	@Autowired
	private IvStatusRepo vstatusRepo;

	@Override
	public List<VerificationStatus> getStatus() {
		// TODO Auto-generated method stub
		return (List<VerificationStatus>) vstatusRepo.findAll();
	}


}
