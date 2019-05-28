package com.example.electrolcommision.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.electrolcommision.entity.Party;
import com.example.electrolcommision.service.PartyService;

@RestController
public class PartyController {
	@Autowired
	private PartyService partyService;
	
	
	@GetMapping("/ec/parties")
	//@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Party> getAllParties() {
        return partyService.getAll();
    }
	
	@PostMapping("/ec/party")
	//@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public Party addOneParty(@RequestBody Party party) {
		return partyService.addParty(party);
	}
}
