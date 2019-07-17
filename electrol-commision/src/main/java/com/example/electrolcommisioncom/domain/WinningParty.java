package com.example.electrolcommisioncom.domain;

import com.example.electrolcommision.entity.Party;

public class WinningParty {
//	private Long party_id;
	private Party party;
	private Long count;
	
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
//	public Long getParty_id() {
//		return party_id;
//	}
//	public void setParty_id(Long id) {
//		this.party_id = id;
//	}
	public Party getParty() {
		return party;
	}
	public void setParty(Party party) {
		this.party = party;
	}
	
//	public WinningParty(Long id,Long count) {
//		this.party_id=id;
//		this.count=count;
//	}
	
	public WinningParty(Party party,Long count) {
		this.party=party;
		this.count=count;
	}
	
}
