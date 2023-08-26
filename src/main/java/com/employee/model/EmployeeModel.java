package com.employee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EmployeeDetails")
public class EmployeeModel {

	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String gender;
	@Column
	private String designation;
	@Column
	private long number;
	@Column
	private String email;
	@Column
	private long gross;
	@Column
	private long payDays;
	@Column
	private int month;

	public EmployeeModel(int id, String name, String gender, String designation, long number, String email, long gross,
			long payDays, int month) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.designation = designation;
		this.number = number;
		this.email = email;
		this.gross = gross;
		this.payDays = payDays;
		this.month = month;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public long getPayDays() {
		return payDays;
	}

	public void setPayDays(long payDays) {
		this.payDays = payDays;
	}

	public EmployeeModel() {
	}

	public long getGross() {
		return gross;
	}

	public void setGross(long gross) {
		this.gross = gross;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long mobile) {
		this.number = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
