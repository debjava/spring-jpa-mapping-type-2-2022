package com.ddlab.rnd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.entity.o2oud.ShoppingCart;
import com.ddlab.rnd.repository.One2OneUniRepository;
import com.ddlab.rnd.service.One2OneUniService;

@Service
public class One2OneUniServiceImpl implements One2OneUniService {
	
	@Autowired
	private One2OneUniRepository repo;
	
	@Override
	public void saveUniDirectionally(ShoppingCart cart) {
		repo.save(cart);
	}

}
