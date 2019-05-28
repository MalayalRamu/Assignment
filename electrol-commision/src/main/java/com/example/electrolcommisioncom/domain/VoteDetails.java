package com.example.electrolcommisioncom.domain;

import com.example.electrolcommision.entity.Party;
import com.example.electrolcommision.entity.Voter;

public class VoteDetails {
	private Party party;
	private Voter voter;
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
}
