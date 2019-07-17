package com.example.electrolcommisioncom.domain;

import com.example.electrolcommision.entity.Party;
import com.example.electrolcommision.entity.Voter;

public class CastRequest {
//	private Long voterId;
	private Voter voter;
//	private Long partyId;
	private Party party;
//	public Long getVoterId() {
//		return voterId;
//	}
//	public void setVoterId(Long voterId) {
//		this.voterId = voterId;
//	}
	
	
	public Voter getVoter() {
		return voter;
	}
	public void setVoter(Voter voter) {
		this.voter = voter;
	}
	public Party getParty() {
		return party;
	}
	public void setParty(Party party) {
		this.party = party;
	}
	
//	public Long getPartyId() {
//		return partyId;
//	}
//
//	public void setPartyId(Long partyId) {
//		this.partyId = partyId;
//	}
	
	
}
