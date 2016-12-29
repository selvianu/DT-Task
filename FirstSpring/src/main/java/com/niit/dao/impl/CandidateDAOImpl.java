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
import com.niit.dao.CandidateDAO;

@Repository
@Transactional
public class CandidateDAOImpl implements CandidateDAO {

	/*
	 * public CandidateDAOImpl(SessionFactory sessionFactory) {
	 * this.sessionFactory = sessionFactory; }
	 */

	@Autowired
	SessionFactory sessionFactory;

	public void save(Candidate c) {
		System.out.println("DAO" + sessionFactory);
		Session session = sessionFactory.openSession();
		Transaction tcc = session.beginTransaction();
		tcc.begin();
		session.persist(c);
		tcc.commit();
		session.close();
	}

	public void update(Candidate c) {

		Session session = sessionFactory.openSession();
		Transaction tcc = session.beginTransaction();
		tcc.begin();
		session.update(c);
		tcc.commit();
		session.close();
	}

	public void delete(Integer id) {
		Session session = sessionFactory.openSession();
		Transaction tcc = session.beginTransaction();
		tcc.begin();
		Candidate candidate = session.load(Candidate.class, id);
		System.out.println("Get:" + candidate);
		session.delete(candidate);
		tcc.commit();
		session.close();

	}

	public Candidate findById(Integer id) {
		Session session = sessionFactory.openSession();

		Candidate candidate = session.load(Candidate.class, id);
		System.out.println("Get:" + candidate);

		session.close();

		return candidate;

	}

	public List<Candidate> list() {
		Session session = sessionFactory.openSession();

		Query query = session.createQuery(" from Candidate c");
		List<Candidate> list = query.list();
		session.close();

		return list;

	}

	public void delete(Candidate c) {
		Session session = sessionFactory.openSession();
		Transaction tcc = session.beginTransaction();
		tcc.begin();
		session.delete(c);
		tcc.commit();
		session.close();

	}

	public List<Candidate> searchByAadhar(String aadhar) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(" from Candidate c where aadhar=:aadhar");
		query.setParameter("aadhar", aadhar);
		List<Candidate> list = query.list();
		System.out.println("Get:" + list);
		session.close();
		return list;
	}

}
