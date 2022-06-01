package com.ddlab.rnd.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.entity.o2oud.Item;
import com.ddlab.rnd.entity.o2oud.ShoppingCart;
import com.ddlab.rnd.service.One2OneUniService;

@Component
public class One2OneUniMapping {
	
	@Autowired
	private One2OneUniService service;

	public void save() {
		ShoppingCart cart = new ShoppingCart();
		cart.setName("Amazon");
		Item item = new Item();
		item.setName("Amazefit watch");
		cart.setItem(item);
		
		service.saveUniDirectionally(cart);
	}
}
