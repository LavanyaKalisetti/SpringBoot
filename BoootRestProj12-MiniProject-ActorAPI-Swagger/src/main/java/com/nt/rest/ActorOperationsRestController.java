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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;


@RestController
@RequestMapping("/actor-api")
@Tag(name="ActorAPI",description="Operations related to Actor Management")
public class ActorOperationsRestController {
	@Autowired
	private IActorMgmtService actorService;
	
	@PostMapping("/register")
	@Operation(
			summary="Actor registration",
			description="Actor Registration takes place"
			)
	@ApiResponses(value= {
			@ApiResponse(responseCode="210",description="Actor Created",
			content= {@Content(mediaType="application/json",
					schema=@Schema(implementation=ActorVO.class))}
	)})
	public ResponseEntity<?> registerActor(@RequestBody ActorVO vo){
		
		
			//use service
			String msg=actorService.insertActor(vo);
			//return ResponseEntity object
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		
		
	}//method
	
	@PostMapping("/registerAll")
	public ResponseEntity<String> registerActorsInBatch(@RequestBody List<ActorVO> listVO){
		
			//use service
			String msg=actorService.insertActorsBatch(listVO);
			//return ResponseEntity object
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<Iterable<ActorVO>> fetchAllActors(){
		
			//use service
			Iterable<ActorVO> listVO=actorService.showAllActors();
			return new ResponseEntity<Iterable<ActorVO>>(listVO,HttpStatus.OK) ;
		
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<ActorVO> fetchActorById(@PathVariable int id){
		
			//use service
			ActorVO actor=actorService.showActorByid(id);
			return new ResponseEntity<ActorVO>(actor,HttpStatus.OK);
		
	}
	
	@GetMapping("find/{start}/{end}")
	public ResponseEntity<Iterable<ActorVO>> fetchActorsByFeeRange(@PathVariable int start,@PathVariable int end){
		
			//use service
			Iterable<ActorVO> listVO=actorService.showActorsByFeeRange(start, end);
			return new ResponseEntity<Iterable<ActorVO>>(listVO,HttpStatus.OK);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> modifyActor(@RequestBody ActorVO actor){
		//use service
		
			String msg=actorService.updateActor(actor);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
	
	@PatchMapping("/update/{id}/{hikePercentage}")
	public ResponseEntity<String> modifyActor(@PathVariable int id,@PathVariable double hikePercentage){
		//use service
		
			String msg=actorService.updateActorFeeById(id,hikePercentage);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteActor(@PathVariable int id){
		//use the service
		
			String msg=actorService.removeActorById(id);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@DeleteMapping("/remove/{start}/{end}")
	public ResponseEntity<String> deleteActorsByFee(@PathVariable double start,@PathVariable double end){
		//use service
		
			String msg=actorService.deleteActorsByFeeRange(start, end);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}


































