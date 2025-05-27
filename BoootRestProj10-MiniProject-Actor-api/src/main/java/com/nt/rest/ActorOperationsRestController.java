package com.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.ActorEntity;
import com.nt.service.IActorMgmtService;
import com.nt.vo.ActorVO;

@RestController
@RequestMapping("/actor-api")
public class ActorOperationsRestController {
	@Autowired
	private IActorMgmtService actorService;
	
	@PostMapping("/register")
	public ResponseEntity<?> registerActor(@RequestBody ActorVO vo){
		
		try {
			//use service
			String msg=actorService.insertActor(vo);
			//return ResponseEntity object
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		}
		catch(Exception e) {
			return new ResponseEntity<String>("problem in registration::"+e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);	
		}
	}//method
	
	@PostMapping("/registerAll")
	public ResponseEntity<String> registerActorsInBatch(@RequestBody List<ActorVO> listVO){
		try {
			//use service
			String msg=actorService.insertActorsBatch(listVO);
			//return ResponseEntity object
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		}
		catch(Exception e) {
			return new ResponseEntity<String>("problem is registration::"+e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);	
		}
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> fetchAllActors(){
		try {
			//use service
			Iterable<ActorVO> listVO=actorService.showAllActors();
			return new ResponseEntity<Iterable<ActorVO>>(listVO,HttpStatus.OK) ;
			}
		catch(Exception e) {
			return new ResponseEntity<String>("problem in retrieving :"+e.getMessage(),HttpStatus.OK);
			
		}
		
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?> fetchActorById(@PathVariable int id){
		try {
			//use service
			ActorVO actor=actorService.showActorByid(id);
			return new ResponseEntity<ActorVO>(actor,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<String>("Problem in retrieving::"+e.getMessage(),HttpStatus.OK);
		}
	}
	
	@GetMapping("find/{start}/{end}")
	public ResponseEntity<?> fetchActorsByFeeRange(@PathVariable int start,@PathVariable int end){
		try {
			//use service
			Iterable<ActorVO> listVO=actorService.showActorsByFeeRange(start, end);
			return new ResponseEntity<Iterable<ActorVO>>(listVO,HttpStatus.OK);
		}
	catch(Exception e) {
		return new ResponseEntity<String>("Problem in retrieving::"+e.getMessage(),HttpStatus.OK);
	}
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> modifyActor(@RequestBody ActorVO actor){
		//use service
		try {
			String msg=actorService.updateActor(actor);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<String>("Problem in updation::"+e.getMessage(),HttpStatus.OK);
		}
	}
	
	@PatchMapping("/update/{id}/{hikePercentage}")
	public ResponseEntity<String> modifyActor(@PathVariable int id,@PathVariable double hikePercentage){
		//use service
		try {
			String msg=actorService.updateActorFeeById(id,hikePercentage);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<String>("Problem in updation::"+e.getMessage(),HttpStatus.OK);
		
		}
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteActor(@PathVariable int id){
		//use the service
		try {
			String msg=actorService.removeActorById(id);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<String>("Problem in deletion::"+e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		
	}
	
	@DeleteMapping("/remove/{start}/{end}")
	public ResponseEntity<String> deleteActorsByFee(@PathVariable double start,@PathVariable double end){
		//use service
		try {
			String msg=actorService.deleteActorsByFeeRange(start, end);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<String>("Problem in deletion::"+e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
	}
}


































