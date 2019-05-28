package com.example.electrolcommision.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.electrolcommision.entity.Party;


public interface PartyRepository extends CrudRepository<Party, Long>{
	
}
