package com.ddlab.rnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.m2m.bid.Item;


@Repository
public interface Many2ManyBidRepository extends CrudRepository<Item, Long>{

}
