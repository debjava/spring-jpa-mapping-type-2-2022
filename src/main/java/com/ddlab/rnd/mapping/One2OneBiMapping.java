package com.ddlab.rnd.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.entity.o2obd.Item;
import com.ddlab.rnd.entity.o2obd.ShoppingCart;
import com.ddlab.rnd.service.One2OneBdService;

@Component
public class One2OneBiMapping {
	
	@Autowired
	private One2OneBdService service;
	
	public void save() {
		ShoppingCart cart = new ShoppingCart();
		cart.setName("Amazone");
		Item item = new Item();
		item.setName("Xiomi Mobile");
		cart.setItem(item);
		item.setCart(cart);// Use for Bidirectional
		
		service.saveBidirectionally(cart);
	}
}
