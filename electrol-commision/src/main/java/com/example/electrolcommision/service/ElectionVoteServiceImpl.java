package com.example.electrolcommision.service;

import java.util.ArrayList;
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
import com.example.electrolcommisioncom.domain.VoteDetails;
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
//		Optional<Voter> ovoter = voterRepo.findById(request.getVoterId());
		Optional<Voter> ovoter = voterRepo.findById(request.getVoter().getId());
		if(ovoter.isPresent()) {
			Voter voter = ovoter.get();
			ElectionVotes electionVote = null;
			if(!voter.isVoted()) {
//				electionVote=ElectionVotes.newVote(request.getPartyId(), voter.getConstituency().getId(), request.getVoterId());
				electionVote=ElectionVotes.newVote(request.getParty(), voter.getConstituency(), request.getVoter());
				voter.setVoted(true);
				ElectionVotesRepo.save(electionVote);
				voterRepo.save(voter);
				return "Vote is Casted";
			}else return "Voter already voted";
		}else return "Voter not registered";
	}

	@Override
	public VoteDetails getVote(Long id) {
		VoteDetails vote = new VoteDetails();
//		vote.setParty(PartyRepo.findById(ElectionVotesRepo.findById(id).get().getpartyid()).get());
//		vote.setVoter(voterRepo.findById(ElectionVotesRepo.findById(id).get().getvoterid()).get());
		vote.setParty(ElectionVotesRepo.findById(id).get().getParty());
		vote.setVoter(voterRepo.findById(ElectionVotesRepo.findById(id).get().getVoter().getId()).get());
		return vote;
	}

	@Override
	public Party findOverallWinningparty() {
		ArrayList<WinningParty> partycount = (ArrayList<WinningParty>) ElectionVotesRepo.overallWinningParty();
//		Party party=PartyRepo.findById(partycount.get(0).getParty_id()).get();
		Party party=partycount.get(0).getParty();
		return party;
	}


	@Override
	public Party findConstituencyWinningparty(Long constituencyid) {
		ArrayList<WinningParty> partycount = (ArrayList<WinningParty>) ElectionVotesRepo.constituencyWinningParty(constituencyid);
//		Party party=PartyRepo.findById(partycount.get(0).getParty_id()).get();
		Party party=partycount.get(0).getParty();
		return party;
	}

}
