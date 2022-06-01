package com.ddlab.rnd.entity.m2m.uni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "ShoppingCart_m2mu")
@Table(name = "shoppingcart_m2mu")
@Getter
@Setter
public class ShoppingCart {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="name")
	private String name;
}
