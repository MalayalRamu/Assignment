package com.example.electrolcommisioncom.domain;

public class WinningParty {
	private Long party_id;
	private Long count;
	
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public Long getParty_id() {
		return party_id;
	}
	public void setParty_id(Long party_id) {
		this.party_id = party_id;
	}
	
	public WinningParty(Long party_id,Long count) {
		this.party_id=party_id;
		this.count=count;
	}
}
