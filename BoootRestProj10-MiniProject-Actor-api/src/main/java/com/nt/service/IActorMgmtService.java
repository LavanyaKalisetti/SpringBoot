package com.nt.service;

import com.nt.vo.ActorVO;

public interface IActorMgmtService {
	public String insertActor(ActorVO actorVO);
	public String insertActorsBatch(Iterable<ActorVO> actotsVO);
	public Iterable<ActorVO> showAllActors();
	public ActorVO showActorByid(int id);
	public Iterable<ActorVO> showActorsByFeeRange(double startFee,double endFee );
	public String updateActor(ActorVO vo);
	public String updateActorFeeById(int id,double hikePercentage);
	public String removeActorById(int id);
	public String deleteActorsByFeeRange(double start,double end);


}
