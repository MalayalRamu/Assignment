package com.example.electrolcommision.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parties")
public class Party {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="party_id")
	private Long partyId;
	@Column(name="partyname")
	private String partyname;
	public Long getId() {
		return partyId;
	}
	public void setId(Long PartyId) {
		this.partyId = PartyId;
	}
	public String getName() {
		return partyname;
	}
	public void setName(String name) {
		this.partyname = name;
	}
	
	
}
