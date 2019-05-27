package com.example.electrolcommision.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.electrolcommision.entity.Constituency;
import com.example.electrolcommision.service.ConstituencyService;

@RestController
public class ConstituencyController {
	
	@Autowired
	private ConstituencyService constituencyService;
	
	@PostMapping("/ec/constituency")
	public Constituency createAConstituency(@RequestBody Constituency constituency){
		
		return constituencyService.createConstituency(constituency);
	}
	
	@GetMapping("/ec/constituencies")
	public List<Constituency> getAllConstituencies(){
		return constituencyService.getAllConstituencies();
	}
}
