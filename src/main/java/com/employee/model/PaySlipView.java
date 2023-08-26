package com.employee.model;

public class PaySlipView {
	private EmployeeModel employee;
	private long gross;
	private long basic;
	private long hra;
	private long variableAllowance;
	private long amount;
	private int perDay;

	public EmployeeModel getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeModel employee) {
		this.employee = employee;
	}

	public long getGross() {
		return gross;
	}

	public void setGross(long gross) {
		this.gross = gross;
	}

	public long getBasic() {
		return basic;
	}

	public void setBasic(long basic) {
		this.basic = basic;
	}

	public long getHra() {
		return hra;
	}

	public void setHra(long hra) {
		this.hra = hra;
	}

	public long getVariableAllowance() {
		return variableAllowance;
	}

	public void setVariableAllowance(long variableAllowance) {
		this.variableAllowance = variableAllowance;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public int getPerDay() {
		return perDay;
	}

	public void setPerDay(int perDay) {
		this.perDay = perDay;
	}

}
