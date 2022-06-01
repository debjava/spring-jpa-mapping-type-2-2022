package com.ddlab.rnd.one2many.uni;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "ShoppingCart_O2MU")
@Table(name = "shopping_cart_o2mu")
@Getter @Setter
public class ShoppingCart {
	
	@Id @GeneratedValue
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Item> items = new HashSet<Item>();

}
