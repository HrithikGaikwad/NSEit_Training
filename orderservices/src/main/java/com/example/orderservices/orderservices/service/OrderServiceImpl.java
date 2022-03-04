package com.example.orderservices.orderservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderservices.orderservices.model.Order;
import com.example.orderservices.orderservices.repo.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepo repo;

	@Override
	public List<Order> displayAll() {
		
		return repo.findAll() ;
	}

	@Override
	public String insertOrder(Order order) {
	     repo.save(order);
		return "Order Added";
	}

	@Override
	public String deleteOrder(int oid) {
		repo.deleteById(oid);
		return "Order Deleted";
	}

}
