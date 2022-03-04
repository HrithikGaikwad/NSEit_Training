package com.example.orderservices.orderservices.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.orderservices.orderservices.model.Order;

@Repository
@Transactional
public interface OrderRepo extends JpaRepository<Order, Integer>{

}
