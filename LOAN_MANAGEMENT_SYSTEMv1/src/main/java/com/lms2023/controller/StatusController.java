package com.lms2023.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms2023.model.Status;
import com.lms2023.model.loanOfficer;
import com.lms2023.service.ILoanOfficerService;
import com.lms2023.service.IStatusService;

@CrossOrigin
@RestController // combination of @Controller+@Configuration
@RequestMapping("/api")
public class StatusController {
	@Autowired
	private IStatusService statusService;
	//list status
		@GetMapping("/status")
		public List<Status> getloanOfficers(){
			return statusService.getStatus();
		}
}
