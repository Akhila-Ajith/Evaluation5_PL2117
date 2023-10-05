package com.lms2023.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms2023.common.APIResponse;
import com.lms2023.model.Customer;
import com.lms2023.service.ICustomerService;




@CrossOrigin
@RestController // combination of @Controller+@Configuration
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	private ICustomerService customerService;
	@Autowired
	private APIResponse apiResponse;
	
	//list customers
	@GetMapping("/customers")
	public List<Customer> getCustomer(){
		return customerService.getCustomer();
	}

	//add customer
		@PostMapping("/customers")
		public ResponseEntity<APIResponse> addCustomer(@RequestBody Customer customer){
		

			customerService.saveCustomer(customer);
				
			apiResponse.setData("CUSTOMER ADDED SUCCESFULLY");
			apiResponse.setStatus(200);
			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);

		}
	
	
}
