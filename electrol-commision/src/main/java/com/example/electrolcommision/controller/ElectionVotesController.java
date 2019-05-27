package com.example.electrolcommision.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.electrolcommision.entity.ElectionVotes;
import com.example.electrolcommision.entity.Party;
import com.example.electrolcommision.entity.Voter;
import com.example.electrolcommision.service.ElectionVoteService;
import com.example.electrolcommision.service.ElectionVoteServiceImpl;
import com.example.electrolcommisioncom.domain.CastRequest;

@RestController
public class ElectionVotesController {
	
	@Autowired
	private ElectionVoteService electionvoteService;

	@PostMapping("/ec/vote/cast")
	public ResponseEntity<String> castAVote(@RequestBody CastRequest request) {
		return new ResponseEntity(electionvoteService.castVote(request),HttpStatus.OK);

	}
	
	@GetMapping("/ec/vote/deatils/{id}")
	public ElectionVotes getVote(@PathVariable("id") Long id){
		return electionvoteService.getVote(id);
	}
	
}

