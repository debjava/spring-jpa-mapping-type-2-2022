package com.ddlab.rnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.one2many.uni.ShoppingCart;

@Repository
public interface One2ManyUniRepository extends CrudRepository<ShoppingCart, Long>{

}
