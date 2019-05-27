package com.example.electrolcommision.service;

import java.util.List;

import com.example.electrolcommision.entity.Constituency;

public interface ConstituencyService {

	Constituency createConstituency(Constituency constituency);

	List<Constituency> getAllConstituencies();

}
