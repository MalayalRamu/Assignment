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
	public void setParty_id(Long id) {
		this.party_id = id;
	}
	
	public WinningParty(Long id,Long count) {
		this.party_id=id;
		this.count=count;
	}
}
