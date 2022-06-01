package com.ddlab.rnd.mapping;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.entity.m2m.bid.Item;
import com.ddlab.rnd.entity.m2m.bid.ShoppingCart;
import com.ddlab.rnd.service.Many2ManyBidService;

@Component
public class Many2ManyBidMapping {
	
	@Autowired
	private Many2ManyBidService service;
	
	public void save() {
		Set<ShoppingCart> shoppingCarts = new HashSet<>();
		
		ShoppingCart sc1 = new ShoppingCart();
		sc1.setName("Wallmart Shopping");
		
		ShoppingCart sc2 = new ShoppingCart();
		sc2.setName("Snapdel Shopping");
		
		shoppingCarts.add(sc1);
		shoppingCarts.add(sc2);
		
		Set<Item> items = new HashSet<>();
		
		Item it1 = new Item();
		it1.setName("Hati");
		
		Item it2 = new Item();
		it2.setName("Ghoda");
		
		items.add(it1);
		items.add(it2);
		
		sc1.getItems().add(it1);
		sc2.getItems().add(it2);
		
		it1.getShoppingCarts().add(sc1);
		it2.getShoppingCarts().add(sc2);
		
		service.saveAllItems(items);
	}
}