package com.example.electrolcommision.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.electrolcommision.entity.Constituency;
import com.example.electrolcommision.repository.ConstituencyRepository;

@Service
public class ConstituencyServiceImpl implements ConstituencyService {

	@Autowired
	private ConstituencyRepository constituencyRepo;
	
	@Override
	public Constituency createConstituency(Constituency constituency) {
		return constituencyRepo.save(constituency);
	}

	@Override
	public List<Constituency> getAllConstituencies(){
		return (List<Constituency>) constituencyRepo.findAll();
	}
	
}
