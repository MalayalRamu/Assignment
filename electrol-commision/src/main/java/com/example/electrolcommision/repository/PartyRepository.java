package com.example.electrolcommision.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.electrolcommision.entity.Party;


public interface PartyRepository extends CrudRepository<Party, Long>{
	//List<Party> findAllParties();
	
}
