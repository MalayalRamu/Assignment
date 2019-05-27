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
	
	@Column(name="party_id")
	private Long partyid;
	
	@Column(name="constituency_id")
	private Long constituencyid;
	
	@Column(name="voter_id")
	private Long voterid;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getpartyid() {
		return partyid;
	}
	public void setpartyid(Long id) {
		this.partyid = id;
	}
	
	public Long getconstituencyid() {
		return constituencyid;
	}
	public void setconstituencyid(Long id) {
		this.constituencyid = id;
	}
	
	public Long getvoterid() {
		return voterid;
	}
	public void setvoterid(Long id) {
		this.voterid = id;
	}
	
	public static ElectionVotes newVote(Long partyId, Long constituencyId,Long voterId) {
		ElectionVotes vote = new ElectionVotes();
		vote.setconstituencyid(constituencyId);
		vote.setpartyid(partyId);
		vote.setvoterid(voterId);
		return vote;
	}
	
}
