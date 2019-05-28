package com.example.electrolcommision.service;

import com.example.electrolcommision.entity.ElectionVotes;
import com.example.electrolcommision.entity.Party;
import com.example.electrolcommisioncom.domain.CastRequest;

public interface ElectionVoteService {
	
	String castVote(CastRequest request);
	
	ElectionVotes getVote(Long id);
	
	Party findOverallWinningparty();
	
	Party findConstituencyWinningparty(Long constituencyid);

}
