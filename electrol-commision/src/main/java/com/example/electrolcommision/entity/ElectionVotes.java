package com.example.electrolcommision.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
	
//	@Column(name="party_id")
//	private Long partyid;
//	
//	@Column(name="constituency_id")
//	private Long constituencyid;
	
//	@Column(name="voter_id")
//	private Long voterid;
	
	@OneToOne
	@JoinColumn(name = "voter_id")
	@Fetch(FetchMode.JOIN)
	private Voter voter;
	
	@ManyToOne
	@JoinColumn(name = "party_id")
	@Fetch(FetchMode.JOIN)
	private Party party;
	
	@ManyToOne
	@JoinColumn(name = "constituency_id")
	@Fetch(FetchMode.JOIN)
	private Constituency constituency;
	
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
	public Constituency getConstituency() {
		return constituency;
	}
	public void setConstituency(Constituency constituency) {
		this.constituency = constituency;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

//	public Long getpartyid() {
//		return partyid;
//	}
//	public void setpartyid(Long id) {
//		this.partyid = id;
//	}
//	
//	public Long getconstituencyid() {
//		return constituencyid;
//	}
//	public void setconstituencyid(Long id) {
//		this.constituencyid = id;
//	}
	
//	public Long getvoterid() {
//		return voterid;
//	}
//	public void setvoterid(Long id) {
//		this.voterid = id;
//	}
	
	
//	public static ElectionVotes newVote(Long partyId, Long constituencyId,Long voterId) {
//		ElectionVotes vote = new ElectionVotes();
//		vote.setconstituencyid(constituencyId);
//		vote.setpartyid(partyId);
//		vote.setvoterid(voterId);
//		return vote;
//	}
	
	public static ElectionVotes newVote(Party party,Constituency constituency,Voter voter) {
		ElectionVotes vote = new ElectionVotes();
		vote.setConstituency(constituency);
		vote.setParty(party);
		vote.setVoter(voter);
		return vote;
	}
}
