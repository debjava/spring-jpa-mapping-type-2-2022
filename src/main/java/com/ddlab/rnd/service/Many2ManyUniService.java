package com.ddlab.rnd.service;

import java.util.Set;

import com.ddlab.rnd.entity.m2m.uni.Item;

public interface Many2ManyUniService {
	
	void saveAllStudentUnidirectionally(Set<Item> items);
}