package com.nt.ms;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.IBillingMSClientComp;
import com.nt.client.IBillingMSClientComp;

@RestController
@RequestMapping("/shopping-api")
public class ShoppingOperationsMS {
	@Autowired
	private IBillingMSClientComp client;
	
	@Value("${db.user}")
	private String username;
	@Value("${db.pwd}")
	private String password;
	
	@GetMapping("/purchase")
	public ResponseEntity<String>doShopping(){
		System.out.println("client comp proxy class name::"+client.getClass());
		System.out.println("proxy class implemented interfaces::"+Arrays.toString(client.getClass().getInterfaces()));
		System.out.println("proxy class methods::"+Arrays.toString(client.getClass().getDeclaredMethods()));
		
		String msg="shirt,Trouser items are purchased db.user="+username+"...."+"db.pwd="+password;
		
		//invoke Target ms endpoint through client comp
		ResponseEntity<String> resp=client.invokeDoBilling();
		
		//generate the final result
		String result=msg+"..."+resp.getBody();
		
		//return ResponseEntity object
		return new ResponseEntity<String>(result,HttpStatus.OK);
		
	}

}
