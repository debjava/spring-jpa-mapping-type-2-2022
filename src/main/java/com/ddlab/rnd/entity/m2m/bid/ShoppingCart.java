package com.ddlab.rnd.entity.m2m.bid;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "ShoppingCart_m2mb")
@Table(name = "shoppingcart_m2mb")
@Getter
@Setter
public class ShoppingCart {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@ManyToMany(mappedBy="shoppingCarts")
    private Set<Item> items = new HashSet<Item>();
}
