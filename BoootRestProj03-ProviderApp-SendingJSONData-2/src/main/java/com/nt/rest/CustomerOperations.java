package com.nt.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Customer;

@RestController
@RequestMapping("/customer-api")
public class CustomerOperations {
	

	@GetMapping("/show")
	public ResponseEntity<Customer> showCustomerData(){
		System.out.println("CustomerOperationsController.showCustomerData()");
		Customer cust=new Customer(1001,"Sreyan","Hyderabad",98767.0);
		//HttpStatus status=HttpStatus.OK;
		return ResponseEntity.ok(cust);

}
}