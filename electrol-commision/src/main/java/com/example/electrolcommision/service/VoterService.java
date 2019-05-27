package com.example.electrolcommision.service;

import java.util.List;

import com.example.electrolcommision.entity.ElectionVotes;
import com.example.electrolcommision.entity.Voter;
import com.example.electrolcommisioncom.domain.CastRequest;

public interface VoterService {

	Voter createAVoter(Voter voter);

	List<Voter> getAllVoters();

//	ElectionVotes castVote(CastRequest request);

}
