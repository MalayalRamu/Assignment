package com.example.electrolcommision.service;

import java.util.List;

import com.example.electrolcommision.entity.ElectionVotes;
import com.example.electrolcommision.entity.Party;
import com.example.electrolcommisioncom.domain.CastRequest;
import com.example.electrolcommisioncom.domain.WinningParty;

public interface ElectionVoteService {
	
	String castVote(CastRequest request);
	
	ElectionVotes getVote(Long id);


}
