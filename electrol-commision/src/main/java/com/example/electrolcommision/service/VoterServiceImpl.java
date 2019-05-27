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

//	@Override
//	public ElectionVotes castVote(CastRequest request) {
//		Optional<Voter> ovoter = voterRepository.findById(request.getVoterId());		
//		if(ovoter.isPresent()) {
//			Voter voter = ovoter.get();
//			voter.setVoted(true);
//			 List<ElectionVotes> l= myfunc(request.getPartyId(),voter.getConstituency().getId());
//			 ElectionVotes eleVotes = null;
//			 if(l.size() == 0) {
//				 eleVotes = ElectionVotes.newVote(request.getPartyId(), voter.getConstituency().getId());				 
//			 }else {
//				 eleVotes = l.get(0);
//				 eleVotes.setCount(eleVotes.getCount()+1);
//			 }
//			 voterRepository.save(voter);
//			 return electionVotesRepo.save(eleVotes);
//
//		}
//		return null;
//		
//	}
//	
//	public List<ElectionVotes> myfunc(Long partyId, Long constituencyId) {
//		CriteriaBuilder cb = em.getCriteriaBuilder();
//		CriteriaQuery<ElectionVotes> query = cb.createQuery(ElectionVotes.class);
//		Root<ElectionVotes> root = query.from(ElectionVotes.class);
//		query.select(root);
//		List<Predicate> andPredicate = new ArrayList<>();
//		andPredicate.add(cb.equal(root.get("party"), partyId));
//		andPredicate.add(cb.equal(root.get("constituency"), constituencyId));
//		query.where(cb.and(andPredicate.toArray(new Predicate[] {})));
//		TypedQuery<ElectionVotes> tq = em.createQuery(query);
//		List<ElectionVotes> result = new ArrayList<ElectionVotes>(tq.getResultList());
//		return result;
//	}

}
