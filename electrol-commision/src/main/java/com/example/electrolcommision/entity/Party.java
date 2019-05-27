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
	private Long Id;
	@Column(name="partyname")
	private String name;
	public Long getId() {
		return Id;
	}
	public void setId(Long PartyId) {
		this.Id = PartyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
