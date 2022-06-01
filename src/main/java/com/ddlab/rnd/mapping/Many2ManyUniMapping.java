package com.ddlab.rnd.mapping;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.entity.m2m.uni.Item;
import com.ddlab.rnd.entity.m2m.uni.ShoppingCart;
import com.ddlab.rnd.service.Many2ManyUniService;

@Component
public class Many2ManyUniMapping {
	
	@Autowired
	private Many2ManyUniService service;
	
	public void save() {
		
		Set<ShoppingCart> scienceTeachers = new HashSet<ShoppingCart>();

		ShoppingCart amazonCart = new ShoppingCart();
		amazonCart.setName("Amazon Shopping");

		ShoppingCart flipkart = new ShoppingCart();
		flipkart.setName("Flipkart Shopping");

		scienceTeachers.add(amazonCart);
		scienceTeachers.add(flipkart);

		Item item1 = new Item();
		item1.setName("Washing Machine");

		Item item2 = new Item();
		item2.setName("Sony Bravia");

		Item item3 = new Item();
		item3.setName("Samsung Refrigenrator");

//		book.setTeachers(howToProgramWithJavaAuthor);
		item1.setShoppingCarts(scienceTeachers);
		item2.setShoppingCarts(scienceTeachers);
		item3.setShoppingCarts(scienceTeachers);
		
		Set<Item> students = new HashSet<>();
		students.add(item1);
		students.add(item2);
		students.add(item3);
		
		service.saveAllStudentUnidirectionally(students);


	}
}