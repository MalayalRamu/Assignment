package com.example.electrolcommision.service;

import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.electrolcommision.entity.Voter;
import com.example.electrolcommision.repository.VoterRepository;

@Service
public class VoterServiceImpl implements VoterService{

	@Autowired
	private VoterRepository voterRepository;
	@Autowired
	EntityManager em;
	
	@Override
	public Voter createAVoter(Voter voter) {
		return voterRepository.save(voter);
	}
	
	@Override
	public List<Voter> getAllVoters(){
		return (List<Voter>) voterRepository.findAll();
	}
	
}
