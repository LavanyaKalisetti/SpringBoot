package com.nt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.Entity.Actor;

public interface IActorRepository extends JpaRepository<Actor, Integer> {

}
