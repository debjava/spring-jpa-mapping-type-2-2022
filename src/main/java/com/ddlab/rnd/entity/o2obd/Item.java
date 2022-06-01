package com.ddlab.rnd.entity.o2obd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "Item_O2OB")
@Table(name = "item_o2ob")
@Getter @Setter
public class Item {

	@Id @GeneratedValue
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@OneToOne(mappedBy = "item")
	private ShoppingCart cart;
}
