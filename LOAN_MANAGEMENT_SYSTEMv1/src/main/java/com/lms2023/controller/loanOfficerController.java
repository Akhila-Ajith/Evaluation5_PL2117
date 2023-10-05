package com.lms2023.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms2023.model.Customer;
import com.lms2023.model.loanOfficer;
import com.lms2023.service.ICustomerService;
import com.lms2023.service.ILoanOfficerService;

@CrossOrigin
@RestController // combination of @Controller+@Configuration
@RequestMapping("/api")
public class loanOfficerController {
	@Autowired
	private ILoanOfficerService loanOfficerService;
	//list loan officers
		@GetMapping("/loanofficers")
		public List<loanOfficer> getloanOfficers(){
			return loanOfficerService.getloanOfficer();
		}
}
