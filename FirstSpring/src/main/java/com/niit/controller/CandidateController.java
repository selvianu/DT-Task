package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.bean.Candidate;
import com.niit.dao.CandidateDAO;

@Controller
@RequestMapping("/candidate")
public class CandidateController {
	
	@Autowired
	private CandidateDAO candidateDao;

	@RequestMapping("/")
	public String home(ModelMap modelMap) {

		List<Candidate> list = candidateDao.list();
		System.out.println("List:" + list);
		modelMap.put("CANDIDATE_LIST", list);
		return "index";

	}

	@RequestMapping("/new")
	public String add() {
		return "add";
	}

	@RequestMapping("/edit")
	public String edit(@RequestParam("id") Integer id, ModelMap modelMap) {
		Candidate candidate = candidateDao.findById(id);
		modelMap.put("CANDIDATE", candidate);
		return "update";

	}

	@RequestMapping("/search")
	public String search() {
		return "Search";

	}

	@RequestMapping("/SearchByAadhar")
	public String search(@RequestParam("aadhar") String aadhar, ModelMap modelMap) {
		List<Candidate> candidate = candidateDao.searchByAadhar(aadhar);
		modelMap.put("CANDIDATE_LIST", candidate);
		return "Search";
	}

	@RequestMapping("/del")
	public String gotoDeletePage() {
		// System.out.println(sessionFactory);
		return "delete";

	}

	@RequestMapping("/Save")
	public String save(@RequestParam("name") String name, @RequestParam("email_id") String emailId,
			@RequestParam("password") String password) {
		// System.out.println("add" + name + voterid + aadhar);
		Candidate c = new Candidate();
		c.setName(name);
		c.setEmailId(emailId);
		c.setPassword(password);
		System.out.println(c);
		candidateDao.save(c);
		return "redirect:/";
		
	}

	@RequestMapping("/Update")
	public String update(@RequestParam("id") Integer id, @RequestParam("name") String name,
			@RequestParam("email_id") String emailId, @RequestParam("password") String password) {
		// System.out.println("add" + name + voterid + aadhar);
		Candidate c = new Candidate();
		c.setId(id);
		c.setName(name);
		c.setEmailId(emailId);
		c.setPassword(password);
		System.out.println(c);
		candidateDao.update(c);
		return "redirect:/";

	}

	@RequestMapping("/Delete")
	public String delete(@RequestParam("id") Integer id) {

		System.out.println("Delete:" + id);

		candidateDao.delete(id);
		return "redirect:/";

	}
}
