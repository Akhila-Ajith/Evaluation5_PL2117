package com.lms2023.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms2023.common.APIResponse;
import com.lms2023.model.Customer;
import com.lms2023.service.IAdminService;



@CrossOrigin
@RestController // combination of @Controller+@Configuration
@RequestMapping("/api")
public class AdminController {
	@Autowired
	private IAdminService adminService;
	@Autowired
	private APIResponse apiResponse;
	//add customer
		@PostMapping("/administrator/addcustomer")
		public ResponseEntity<APIResponse> addCustomer(@RequestBody Customer customer){
		

			adminService.saveCustomer(customer);
				
			apiResponse.setData("CUSTOMER ADDED SUCCESFULLY");
			apiResponse.setStatus(200);
			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);

		}
		
		//add loan officer
		@PutMapping("/updatecustomer")
		public ResponseEntity<APIResponse> update(@RequestBody Customer customer){
			System.out.println(customer);
			adminService.saveCustomer(customer);

			apiResponse.setData("CUSTOMER UPDATED SUCCESFULLY");
			apiResponse.setStatus(200);
			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);

		}
	
		
		}
		
		


