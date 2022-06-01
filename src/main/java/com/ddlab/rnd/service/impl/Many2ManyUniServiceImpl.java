package com.ddlab.rnd.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.entity.m2m.uni.Item;
import com.ddlab.rnd.repository.Many2ManyUniRepository;
import com.ddlab.rnd.service.Many2ManyUniService;

@Service
public class Many2ManyUniServiceImpl implements Many2ManyUniService {
	
	@Autowired
	private Many2ManyUniRepository uniRepo;


	@Override
	public void saveAllStudentUnidirectionally(Set<Item> students) {
		uniRepo.saveAll(students);
	}
	
}