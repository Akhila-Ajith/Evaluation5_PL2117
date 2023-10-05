package com.lms2023.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lms2023.model.Status;
import com.lms2023.model.VerificationStatus;
@Service
public interface IvStatusService {

	public List<VerificationStatus> getStatus();

}
