package com.example.electrolcommision.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.electrolcommision.entity.Party;
import com.example.electrolcommision.repository.PartyRepository;

@Service
public class PartyServiceImpl implements PartyService{

	@Autowired
	PartyRepository partyRepo;
	
	@Override
	public List<Party> getAll() {
		
		return (List<Party>) partyRepo.findAll();
	}

	@Override
	public Party addParty(Party party) {
		return partyRepo.save(party);
	}

	
	
}
