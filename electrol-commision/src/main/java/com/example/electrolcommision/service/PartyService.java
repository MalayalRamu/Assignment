package com.example.electrolcommision.service;

import java.util.List;

import com.example.electrolcommision.entity.Party;

public interface PartyService {

	List<Party> getAll();

	Party addParty(Party party);

}
