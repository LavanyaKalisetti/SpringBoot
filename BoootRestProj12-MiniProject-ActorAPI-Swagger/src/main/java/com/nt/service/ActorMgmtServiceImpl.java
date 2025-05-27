package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.ActorEntity;
import com.nt.repository.IActorRepository;
import com.nt.vo.ActorVO;

@Service("actorservice")
public class ActorMgmtServiceImpl implements IActorMgmtService {
	@Autowired
	private IActorRepository actorRepo;

	@Override
	public String insertActor(ActorVO actorVO) {
        //convert ActorVO class object to ActorEntity class object
		ActorEntity actorEntity=new ActorEntity();
		BeanUtils.copyProperties(actorVO, actorEntity);
		actorEntity.setCreatedBy(System.getProperty("user.name"));
		//save the object
		int idVal=actorRepo.save(actorEntity).getAid();
		return "Actor Object is saved with id value:"+idVal;
	}

	@Override
	public String insertActorsBatch(Iterable<ActorVO> actorsVO) {
		//convert List<ActorVO> to List<ActorEntity>objects
		List<ActorEntity> listEntities=new ArrayList();
		actorsVO.forEach(vo->{
			ActorEntity entity=new ActorEntity();
			BeanUtils.copyProperties(vo,entity);
			listEntities.add(entity);
		});
		//use saveAll objs
		Iterable<ActorEntity>savedEntities=actorRepo.saveAll(listEntities);
		List<Integer> ids=StreamSupport.stream(savedEntities.spliterator(), false)
				                                .map(ActorEntity::getAid).collect(Collectors.toList());
		return ids.size()+"number of records are saved having id Values::"+ids;
		
	}

	@Override
	public Iterable<ActorVO> showAllActors() {
		//use service
		Iterable<ActorEntity> listEntities=actorRepo.findAll();
		//convert list of entities to list of VO class objects
		List<ActorVO> listVO=new ArrayList();
		listEntities.forEach(entity->{
			ActorVO vo=new ActorVO();
			BeanUtils.copyProperties(entity,vo);
			listVO.add(vo);
			});
		return listVO ;
	}

	@Override
	public ActorVO showActorByid(int id) {
		//load the object
		ActorEntity entity=actorRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid id"));
		//Convert ActorEntity object to ActorVO object
		ActorVO vo=new ActorVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}

	@Override
	public Iterable<ActorVO> showActorsByFeeRange(double startFee, double endFee) {
		//use Repo
		Iterable<ActorEntity> listEntities=actorRepo.findActorsByFeeRange(startFee, endFee);
		//convert ListEntities to listVO
		List<ActorVO> listVO=new ArrayList();
		listEntities.forEach(entity->{
			//convert each entity to each VO class obj
			ActorVO vo=new ActorVO();
			BeanUtils.copyProperties(entity, vo);
			listVO.add(vo);
		});
		return null;
	}

	@Override
	public String updateActor(ActorVO vo) {
		//use Repo to load the object
		ActorEntity entity=actorRepo.findById(vo.getAid()).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
       //copy VO object data to entity object
		BeanUtils.copyProperties(vo, entity);
		entity.setUpdatedBy(System.getProperty("user.name"));
		//update the object
		actorRepo.save(entity);
		return vo.getAid()+"Actor details are updated";
	}

	@Override
	public String updateActorFeeById(int id, double hikePercentage) {
		//use repo to load the object
		ActorEntity entity=actorRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
		entity.setFee(entity.getFee()+(entity.getFee()*hikePercentage/100.0));
		//update the object
		actorRepo.save(entity);
		return id+"actor fee is updated";
	}

	@Override
	public String removeActorById(int id) {
		//load the object
		ActorEntity actor=actorRepo.findById(id).orElseThrow(()->new IllegalArgumentException("invalid id"));
		//delete the object
		actorRepo.deleteById(id);
		return id+"Actor has been removed ";
	}

	@Override
	public String deleteActorsByFeeRange(double start, double end) {
		//use service
		int count=actorRepo.removeActorsByFeeRange(start, end);
		return count+"no.of actors are removed";
	}
   
	
	
}























