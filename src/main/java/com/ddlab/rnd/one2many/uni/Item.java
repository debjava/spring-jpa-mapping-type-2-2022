package com.ddlab.rnd.one2many.uni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "Item_O2MU")
@Table(name = "item_o2mu")
@Getter @Setter
public class Item {

	@Id @GeneratedValue
	private long id;
	
	@Column(name = "name")
	private String name;
}
