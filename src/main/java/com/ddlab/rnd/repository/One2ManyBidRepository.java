package com.ddlab.rnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.one2many.bid.ShoppingCart;

@Repository
public interface One2ManyBidRepository extends CrudRepository<ShoppingCart, Long>{

}
