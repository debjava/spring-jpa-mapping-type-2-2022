package com.ddlab.rnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.m2m.uni.Item;

@Repository
public interface Many2ManyUniRepository extends CrudRepository<Item, Long> {

}