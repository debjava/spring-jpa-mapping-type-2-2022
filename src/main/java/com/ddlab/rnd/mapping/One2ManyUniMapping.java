package com.ddlab.rnd.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.one2many.uni.Item;
import com.ddlab.rnd.one2many.uni.ShoppingCart;
import com.ddlab.rnd.service.One2ManyUniService;

@Component
public class One2ManyUniMapping {

	@Autowired
	private One2ManyUniService service;
	
	public void save() {
		ShoppingCart cart = new ShoppingCart();
		cart.setName("Flipcart");
		
		Item item1 = new Item();
		item1.setName("Dell Laptop");
		
		Item item2 = new Item();
		item2.setName("Porttronics Mouse");
		cart.getItems().add(item1);
		cart.getItems().add(item2);
		
		service.saveUnidirectionally(cart);
	}
}
