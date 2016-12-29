package com.niit.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.bean.Candidate;
import com.niit.bean.Medicine;

@Repository
@Transactional
public class MedicineDAOImpl implements MedicineDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	public void save(Medicine m) {

		System.out.println("DAO" + sessionFactory);
		Session session = sessionFactory.openSession();
		Transaction tcc = session.beginTransaction();
		tcc.begin();
		session.persist(m);
		tcc.commit();
		session.close();

	}

	public void update(Medicine m) {

	}

	public void delete(Medicine m) {
		
		Session session = sessionFactory.openSession();
		Transaction tcc = session.beginTransaction();
		tcc.begin();
		session.delete(m);
		tcc.commit();
		session.close();
	}

	public List<Medicine> list() {
		Session session = sessionFactory.openSession();

		Query query = session.createQuery(" from Medicine m");
		List<Medicine> list = query.list();
		session.close();

		return list;
		
	}

	public Medicine findByBatchNo(Integer batchno) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Medicine> searchByName(String medname) {
		// TODO Auto-generated method stub
		return null;
	}

	public Medicine findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
