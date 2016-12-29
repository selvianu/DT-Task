package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.bean.Candidate;
import com.niit.bean.Medicine;
import com.niit.dao.impl.MedicineDAO;

@Controller
@RequestMapping("medicines")
public class MedicineController {

	@Autowired
	private MedicineDAO medicineDao;

	@RequestMapping("/new")
	public String addMedicine() {
		return "./medicines/AddMedicines";

	}

	@RequestMapping("/save")
	public String saveMedicine(@RequestParam("category") String category, @RequestParam("medname") String medname,
			@RequestParam("mdate") String mdate, @RequestParam("exdate") String exdate,
			@RequestParam("batchno") String batchno, @RequestParam("cost") Integer cost) {

		System.out.println("Medicines save");
		Medicine m = new Medicine();
		m.setCategory(category);
		m.setMedname(medname);
		m.setMdate(mdate);
		m.setExdate(exdate);
		m.setBatchno(batchno);
		m.setCost(cost);
		// System.out.println(m);
		medicineDao.save(m);
		return "redirect:/medicines/";
	}

	@RequestMapping("/")
	public String home(ModelMap modelMap) {

		List<Medicine> list = medicineDao.list();
		System.out.println("List:" + list);
		modelMap.put("MEDICINE_LIST", list);
		return "medicines/medicineIndex";

	}

	@RequestMapping("/edit")
	public String edit(@RequestParam("id") Integer id, ModelMap modelMap) {
		Medicine candidate = medicineDao.findById(id);
		modelMap.put("MEDICINE", candidate);
		return "update";

	}

	@RequestMapping("/search")
	public String search() {
		return "Search";

	}

	@RequestMapping("/update")
	public String update(@RequestParam("id") Integer id, @RequestParam("category") String category,
			@RequestParam("medname") String medname, @RequestParam("mdate") String mdate,
			@RequestParam("exdate") String exdate, @RequestParam("batchno") String batchno,
			@RequestParam("cost") Integer cost) {
		Medicine m = new Medicine();
		m.setId(id);
		m.setCategory(category);
		m.setMedname(medname);
		m.setMdate(mdate);
		m.setExdate(exdate);
		m.setBatchno(batchno);
		m.setCost(cost);
		medicineDao.update(m);
		return "redirect:/medicine/";

	}

	@RequestMapping("/Delete")
	public String delete(@RequestParam("id") Integer id) {
		System.out.println("Delete:" + id);
		Medicine m = new Medicine();
		m.setId(id);
		medicineDao.delete(m);
		return "redirect:/medicines/";

	}

	@RequestMapping("/SearchByName")
	public String search(@RequestParam("aadhar") String aadhar, ModelMap modelMap) {
		List<Medicine> medicine = medicineDao.searchByName(aadhar);
		modelMap.put("MEDICINE_LIST", medicine);
		return "Search";
	}

	@RequestMapping("/del")
	public String gotoDeletePage() {
		return "delete";

	}

}
