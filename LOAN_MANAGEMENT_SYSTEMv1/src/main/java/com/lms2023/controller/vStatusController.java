package com.lms2023.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms2023.model.Status;
import com.lms2023.model.VerificationStatus;
import com.lms2023.service.IStatusService;
import com.lms2023.service.IvStatusService;

@CrossOrigin
@RestController // combination of @Controller+@Configuration
@RequestMapping("/api")
public class vStatusController {
	@Autowired
	private IvStatusService vstatusService;
	//list status
		@GetMapping("/vstatus")
		public List<VerificationStatus> getloanOfficers(){
			return vstatusService.getStatus();
		}
}
