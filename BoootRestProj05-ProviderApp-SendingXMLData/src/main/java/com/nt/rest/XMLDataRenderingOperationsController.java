package com.nt.rest;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Actor;
import com.nt.model.Customer;

@RestController
@RequestMapping("/xml-api")
public class XMLDataRenderingOperationsController {
	

	@GetMapping("/customer")
	public ResponseEntity<Customer> showCustomerData(){
		System.out.println("CustomerOperationsController.showCustomerData()");
		Customer cust=new Customer(1001,"Sreyan","Hyderabad",98767.0);
		return new ResponseEntity<Customer>(cust,HttpStatus.OK);

   }
	
	@GetMapping("/actor")
	public ResponseEntity<Actor> showActorData(){
		Actor actor=new Actor(1001,"Nani","Hyderabad",89000.0,new String[] {"Red","Greeen"},
				              List.of("Arjun","Sharwanandh"),Set.of(7898789L,9876780L),Map.of("adhar",987656789,"voterid",9876567),
				             new Customer(1002,"Sreyan","Vizag",56789.0));
		return new ResponseEntity<Actor>(actor,HttpStatus.OK);
	}
	
//	@GetMapping("/allcustomers")
//	public ResponseEntity<List<Customer>> showAllCustomersData(){
//		Customer cust1=new Customer(1001,"Lavanya","Hyderabad",987678.0);
//		Customer cust2=new Customer(1221,"Lekhan","Mumbai",67899.0);
//		Customer cust3=new Customer(1331,"Nivedika","Vizag",98765.9);
//		Customer cust4=new Customer(1441,"Nainika","Punjab",654348.6);
//		List<Customer>list=List.of(cust1,cust2,cust3,cust4);
//		return new ResponseEntity<List<Customer>>(list,HttpStatus.OK);
//	}
	
	@GetMapping("/allcustomers")
	public List<Customer> showAllCustomersData(){
		Customer cust1=new Customer(1001,"Lavanya","Hyderabad",987678.0);
		Customer cust2=new Customer(1221,"Lekhan","Mumbai",67899.0);
		Customer cust3=new Customer(1331,"Nivedika","Vizag",98765.9);
		Customer cust4=new Customer(1441,"Nainika","Punjab",654348.6);
		List<Customer>list=List.of(cust1,cust2,cust3,cust4);
		return list;
	}
}

