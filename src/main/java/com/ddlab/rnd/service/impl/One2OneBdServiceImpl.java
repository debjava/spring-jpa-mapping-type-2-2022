package com.ddlab.rnd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.entity.o2obd.ShoppingCart;
import com.ddlab.rnd.repository.One2OneBiRepository;
import com.ddlab.rnd.service.One2OneBdService;

@Service
public class One2OneBdServiceImpl implements One2OneBdService {
	
	@Autowired
	private One2OneBiRepository bdRepo;

	@Override
	public void saveBidirectionally(ShoppingCart bdCart) {
		bdRepo.save(bdCart);
	}

}
