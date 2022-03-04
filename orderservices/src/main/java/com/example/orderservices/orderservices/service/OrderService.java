package com.example.orderservices.orderservices.service;
import com.example.orderservices.orderservices.model.Order;
import java.util.List;

public interface OrderService {
	
	public List<Order> displayAll(); //Read
	public String insertOrder(Order order); //Create  //Update
	public String deleteOrder(int oid);  //Delete
	

}
