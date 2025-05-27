package com.nt.service;



import org.springframework.data.domain.Pageable;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.nt.Entity.Actor;
import com.nt.Repository.IActorRepository;

@Service
public class ActorMgmtServiceImple implements IActorMgmtService {
	@Autowired
	private IActorRepository actorRepo;

	@Override
	public Page<Actor> showAllActors( Pageable pageable) {
		// TODO Auto-generated method stub
		return actorRepo.findAll(pageable);
		
		
	}

	
	
	
	

	

}

