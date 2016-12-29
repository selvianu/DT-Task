package com.niit.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.bean.Medicine;

@Repository
public interface MedicineDAO {

	public void save(Medicine m);

	public void update(Medicine m);

	public void delete(Medicine m);

	public List<Medicine> list();

	public Medicine findByBatchNo(Integer batchno);

	public List<Medicine> searchByName(String medname);

	public Medicine findById(Integer id);
}
