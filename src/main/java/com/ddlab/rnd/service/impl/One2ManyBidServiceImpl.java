package com.ddlab.rnd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.one2many.bid.ShoppingCart;
import com.ddlab.rnd.repository.One2ManyBidRepository;
import com.ddlab.rnd.service.One2ManyBidService;

@Service
public class One2ManyBidServiceImpl implements One2ManyBidService {

	@Autowired
	private One2ManyBidRepository bdRepo;

	@Override
	public void saveBidirectionally(ShoppingCart cart) {
		bdRepo.save(cart);
	}

}
