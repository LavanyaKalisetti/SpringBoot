package com.nt.service;

import java.util.List;

import com.nt.Entity.Actor;

public interface IActorMgmtService {
	
	public List<Actor>showAllActors();
	
	public String registerActor(Actor actor);
	
	public Actor fetchActorById(int id);
	
	public String editActor(Actor actor);
	
	public String deleteActorById(int id);
	
	}

