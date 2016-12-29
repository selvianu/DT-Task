package com.niit.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.bean.Candidate;
import com.niit.bean.Medicine;
import com.niit.bean.Order;
import com.niit.dao.impl.OrderDAO;

@Controller
@RequestMapping("orders")
public class OrderController {

	@Autowired
	private OrderDAO orderDAO;

	@RequestMapping("/new")
	public String addMedicine() {
		return "./orders/add";

	}

	@RequestMapping("/save")
	public String saveMedicine(@RequestParam("candidate_id") Integer candidateId,
			@RequestParam("medicine_id") Integer medicineId, @RequestParam("qty") Integer qty,
			@RequestParam("order_date") LocalDate orderDate) {

		System.out.println("Orders save");
		Candidate c = new Candidate();
		c.setId(candidateId);

		Medicine m = new Medicine();
		m.setId(medicineId);

		Order o = new Order();
		o.setCandidate(c);

		o.setMedicine(m);

		o.setQty(qty);
		o.setOrderDate(orderDate);
		// System.out.println(m);
		orderDAO.save(o);
		return "redirect:/orders/";
	}

	@RequestMapping("/")
	public String home(ModelMap modelMap) {

		List<Order> list = orderDAO.list();
		System.out.println("List:" + list);
		modelMap.put("ORDER_LIST", list);
		return "orders/list";

	}

}
