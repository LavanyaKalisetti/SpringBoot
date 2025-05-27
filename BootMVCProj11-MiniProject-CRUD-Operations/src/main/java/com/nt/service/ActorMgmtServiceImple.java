package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Entity.Actor;
import com.nt.Repository.IActorRepository;

@Service
public class ActorMgmtServiceImple implements IActorMgmtService {
	@Autowired
	private IActorRepository actorRepo;
	
	
	@Override
	public List<Actor> showAllActors() {
	
		return actorRepo.findAll();
	}


	@Override
	public String registerActor(Actor actor) {
		//set windows username as the created By username
		actor.setCreateBy(System.getProperty("user.name"));
		//save the objectint 
		int idVal=actorRepo.save(actor).getAid();
		return "Actor is saved with id Value:"+idVal;
	}


	@Override
	public Actor fetchActorById(int id) {
		
		return actorRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid id"));
	}


	@Override
	public String editActor(Actor actor) {
		System.out.println(actor.getAid());
		Optional<Actor> opt=actorRepo.findById(actor.getAid());
		if(opt.isPresent()) {
			Actor actor1=opt.get();
			actor.setUpdateCount(actor1.getUpdateCount());
			actor.setUpdateBy(System.getProperty("user.name"));
			actorRepo.save(actor);
			return actor.getAid()+"Actor data is modified";
		}
		return actor.getAid()+"Actor is not found";
	}


	@Override
	public String deleteActorById(int id) {
		Optional<Actor> opt=actorRepo.findById(id);
		if(opt.isPresent()) {
			actorRepo.deleteById(id);
			return id+"Actor is Removed";
		}
		return id+"Actor is not Found for Deletion";
	}

}
