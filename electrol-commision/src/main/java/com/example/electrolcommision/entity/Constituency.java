package com.example.electrolcommision.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "constituencies")
public class Constituency {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="constituency_id")
	private Long constituencyid;
	@Column(name="constituencyname")
	private String constituencyname;
	public Long getId() {
		return constituencyid;
	}
	public void setId(Long id) {
		this.constituencyid = id;
	}
	public String getName() {
		return constituencyname;
	}
	public void setName(String name) {
		this.constituencyname = name;
	}
	
}
