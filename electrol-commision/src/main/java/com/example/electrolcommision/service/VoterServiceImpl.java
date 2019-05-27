package com.example.electrolcommision.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.electrolcommision.entity.ElectionVotes;
import com.example.electrolcommision.entity.Voter;
import com.example.electrolcommision.repository.ElectionVotesRepository;
import com.example.electrolcommision.repository.VoterRepository;
import com.example.electrolcommisioncom.domain.CastRequest;

@Service
public class VoterServiceImpl implements VoterService{

	@Autowired
	private VoterRepository voterRepository;
	@Autowired
	private ElectionVotesRepository electionVotesRepo;
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
