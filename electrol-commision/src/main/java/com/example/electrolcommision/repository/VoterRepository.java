package com.example.electrolcommision.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

import com.example.electrolcommision.entity.Voter;


public interface VoterRepository extends CrudRepository<Voter, Long>{

}
