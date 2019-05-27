package com.example.electrolcommision.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.electrolcommision.entity.ElectionVotes;
import com.example.electrolcommision.entity.Party;
import com.example.electrolcommision.entity.Voter;
import com.example.electrolcommision.repository.ElectionVotesRepository;
import com.example.electrolcommision.repository.PartyRepository;
import com.example.electrolcommision.repository.VoterRepository;
import com.example.electrolcommisioncom.domain.CastRequest;
import com.example.electrolcommisioncom.domain.WinningParty;


@Service
public class ElectionVoteServiceImpl implements ElectionVoteService{
	@Autowired
	ElectionVotesRepository ElectionVotesRepo;
	
	@Autowired
	VoterRepository voterRepo;
	
	@Autowired
	PartyRepository PartyRepo;

	@Override
	public String castVote(CastRequest request) {
		Optional<Voter> ovoter = voterRepo.findById(request.getVoterId());
		if(ovoter.isPresent()) {
			Voter voter = ovoter.get();
			ElectionVotes electionVote = null;
			if(!voter.isVoted()) {
				electionVote=ElectionVotes.newVote(request.getPartyId(), voter.getConstituency().getId(), request.getVoterId());
				voter.setVoted(true);
				ElectionVotesRepo.save(electionVote);
				voterRepo.save(voter);
				return "Vote is Casted";
			}else return "Voter already voted";
		}else return "Voter not registered";
	}

	@Override
	public ElectionVotes getVote(Long id) {
		return ElectionVotesRepo.findById(id).get();
	}

	@Override
	public Party findOverallWinningparty() {
		ArrayList<WinningParty> partycount = (ArrayList<WinningParty>) ElectionVotesRepo.overallWinningParty();
		Party party=PartyRepo.findById(partycount.get(0).getParty_id()).get();
		return party;
	}


	@Override
	public Party findConstituencyWinningparty(Long constituencyid) {
		ArrayList<WinningParty> partycount = (ArrayList<WinningParty>) ElectionVotesRepo.constituencyWinningParty(constituencyid);
		Party party=PartyRepo.findById(partycount.get(0).getParty_id()).get();
		return party;
	}

}
