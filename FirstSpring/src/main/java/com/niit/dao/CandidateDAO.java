package com.niit.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.bean.Candidate;

@Repository
public interface CandidateDAO {

	public void save(Candidate c);

	public void update(Candidate c);

	public void delete(Integer id);

	public List<Candidate> list();

	public Candidate findById(Integer id);

	public List<Candidate> searchByAadhar(String aadhar);
}
