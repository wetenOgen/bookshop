package com.internals.bookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.internals.bookshop.models.Order;


@Repository 
public interface OrderRepo extends JpaRepository<Order,Integer> {
    
}
