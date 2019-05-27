package com.example.electrolcommision.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "votes")
public class ElectionVotes {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="vote_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "party_id")
	@Fetch(FetchMode.JOIN)
	private Party party;
	
	@ManyToOne
	@JoinColumn(name = "constituency_id")
	@Fetch(FetchMode.JOIN)
	private Constituency constituency;
	

	@ManyToOne
	@JoinColumn(name = "voter_id")
	@Fetch(FetchMode.JOIN)
	private Voter voter ;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Party getParty() {
		return party;
	}
	public void setParty(Party party) {
		this.party = party;
	}
	public Constituency getConstituency() {
		return constituency;
	}
	public void setConstituency(Constituency constituency) {
		this.constituency = constituency;
	}
	public Voter getVoter() {
		return voter;
	}
	public void setVoter(Voter voter) {
		this.voter = voter;
	}
	
	public static ElectionVotes newVote(Long partyId, Long constituencyId,Long voterId) {
		ElectionVotes vote = new ElectionVotes();
		Party p = new Party();
		p.setId(partyId);
		Constituency consti = new Constituency();
		consti.setId(constituencyId);
		Voter voter = new Voter();
		voter.setId(voterId);
		vote.setConstituency(consti);
		vote.setParty(p);
		vote.setVoter(voter);
		return vote;
	}
	
	
}
