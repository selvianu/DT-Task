package com.niit.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.bean.Order;

@Repository
@Transactional
public class OrderDAOImpl implements OrderDAO {

	@Autowired
	SessionFactory sessionFactory;

	public void save(Order m) {
		System.out.println("DAO" + sessionFactory);
		Session session = sessionFactory.openSession();
		Transaction tcc = session.beginTransaction();
		tcc.begin();
		session.persist(m);
		tcc.commit();
		session.close();
	}

	public void update(Order m) {
		// TODO Auto-generated method stub

	}

	public void delete(Order m) {
		// TODO Auto-generated method stub

	}

	public List<Order> list() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(" from Order o");
		List<Order> list = query.list();
		session.close();

		return list;
	}

	public Order findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
