package com.ddlab.rnd.entity.m2m.bid;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "Item_m2mb")
@Table(name = "item_m2mb")
@Getter
@Setter
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	private String name;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "shopping_cart_item_m2mb",
		joinColumns = @JoinColumn(name = "cart_id"),
		inverseJoinColumns = @JoinColumn(name = "item_id"))
	private Set<ShoppingCart> shoppingCarts = new HashSet<ShoppingCart>();
}
