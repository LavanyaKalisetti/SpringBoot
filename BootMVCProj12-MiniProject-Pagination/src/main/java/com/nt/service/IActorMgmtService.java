package com.nt.service;


import org.springframework.data.domain.Pageable;


import org.springframework.data.domain.Page;

import com.nt.Entity.Actor;

public interface IActorMgmtService {
	
	public Page<Actor>showAllActors(Pageable pageable);

	
	
}

