package com.example.electrolcommision.service;

import java.util.List;

import com.example.electrolcommision.entity.Voter;

public interface VoterService {

	Voter createAVoter(Voter voter);

	List<Voter> getAllVoters();

}
