package com.ddlab.rnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.o2obd.ShoppingCart;

@Repository
public interface One2OneBiRepository extends CrudRepository<ShoppingCart, Long> {

}
