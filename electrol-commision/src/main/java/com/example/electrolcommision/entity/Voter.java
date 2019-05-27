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
@Table(name = "voters")
public class Voter {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="voter_id")
	private Long id;
	@Column(name="votername")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "constituency_id")
	@Fetch(FetchMode.JOIN)
	private Constituency constituency;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Constituency getConstituency() {
		return constituency;
	}

	public void setConstituency(Constituency constituency) {
		this.constituency = constituency;
	}

	public boolean isVoted() {
		return isVoted;
	}

	public void setVoted(boolean isVoted) {
		this.isVoted = isVoted;
	}
	@Column(name="is_voted")
	private boolean isVoted; 
}
