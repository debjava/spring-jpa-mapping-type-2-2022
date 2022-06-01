package com.ddlab.rnd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.one2many.uni.ShoppingCart;
import com.ddlab.rnd.repository.One2ManyUniRepository;
import com.ddlab.rnd.service.One2ManyUniService;

@Service
public class One2ManyUniServiceImpl implements One2ManyUniService {
	
	@Autowired
	private One2ManyUniRepository repo;

	@Override
	public void saveUnidirectionally(ShoppingCart cart) {
		repo.save(cart);
	}
}
