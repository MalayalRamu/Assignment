package com.example.electrolcommision.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.electrolcommision.entity.ElectionVotes;
import com.example.electrolcommision.entity.Voter;
import com.example.electrolcommision.service.VoterService;
import com.example.electrolcommisioncom.domain.CastRequest;

@RestController
public class VoterController {
	
	@Autowired
	private VoterService voterService;
	
	@PostMapping("/ec/voter")
	public Voter createVoter(@RequestBody Voter voter) {
		voter.setVoted(false);
		return voterService.createAVoter(voter);
	}
	
	@GetMapping("/ec/voters")
	public List<Voter> getAllVoters(){
		return voterService.getAllVoters();
	}
	
}
