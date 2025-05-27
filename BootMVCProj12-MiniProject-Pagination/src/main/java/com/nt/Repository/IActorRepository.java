package com.nt.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.nt.Entity.Actor;
@Repository
public interface IActorRepository extends PagingAndSortingRepository<Actor, Integer> {

	

}
