package com.niit.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class Order {

	@Id
	@GeneratedValue
	private Long id;

	@JoinColumn(name="candidate_id")
	@ManyToOne
	private Candidate candidate;

	@JoinColumn(name="medicine_name")
	@ManyToOne
	private Medicine medicine;

	@Column(name = "qty")
	private Integer qty;

	@Column(name = "cost")
	private Integer totalCost;

	@Column(name = "order_date")
	private LocalDate orderDate;

	@Column(name = "status")
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Medicine getMedicine() {
		return medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Integer getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Integer totalCost) {
		this.totalCost = totalCost;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", candidate=" + candidate + ", medicine=" + medicine + ", qty=" + qty
				+ ", totalCost=" + totalCost + ", orderDate=" + orderDate + ", status=" + status + "]";
	}

}
