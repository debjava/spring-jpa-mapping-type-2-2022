package com.ddlab.rnd.service;

import java.util.Set;

import com.ddlab.rnd.entity.m2m.bid.Item;


public interface Many2ManyBidService {
	
	void saveAllItems(Set<Item> items);

}