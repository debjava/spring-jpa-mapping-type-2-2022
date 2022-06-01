package com.ddlab.rnd.service;

import com.ddlab.rnd.one2many.bid.ShoppingCart;

public interface One2ManyBidService {
	
	void saveBidirectionally(ShoppingCart cart);

}
