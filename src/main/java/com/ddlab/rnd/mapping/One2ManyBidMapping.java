package com.ddlab.rnd.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.one2many.bid.Item;
import com.ddlab.rnd.one2many.bid.ShoppingCart;
import com.ddlab.rnd.service.impl.One2ManyBidServiceImpl;

@Component
public class One2ManyBidMapping {

	@Autowired
	private One2ManyBidServiceImpl service;
	
	public void save() {
		ShoppingCart cart = new ShoppingCart();
		cart.setName("Wallmart");
		
		Item item1 = new Item();
		item1.setName("Music Box");
		item1.setShoppingCart(cart);
		
		Item item2 = new Item();
		item2.setName("Sony TV");
		item2.setShoppingCart(cart);
		
		cart.getItems().add(item1);
		cart.getItems().add(item2);
		
		service.saveBidirectionally(cart);
	}
}
