package com.niit.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.bean.Order;

@Repository
public interface OrderDAO {

	public void save(Order m);

	public void update(Order m);

	public void delete(Order m);

	public List<Order> list();

	public Order findById(Integer id);
}
