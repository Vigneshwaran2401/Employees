package com.employee.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.employee.dao.EmployeeDao;
import com.employee.model.EmployeeModel;
import com.employee.model.PaySlipView;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeDao db;
	
	@RequestMapping(value="/")
	public String showHome() {
		return "home";
	}
	@RequestMapping(value="/employee")
	public String showEmployee(Model model) {
		model.addAttribute("employee",new EmployeeModel());
		return "employee";
	}
	@RequestMapping(value="/register")
	public String registerDetails(EmployeeModel employee) {
		String state = db.saveDetails(employee);
		System.out.println(state);
		if (state.equals("Success")) {
			return "redirect:/paySlip";
		} else {
			return "error";
		}
	}
	@RequestMapping(value="/paySlip")
	public String showPaySheet(Model model) {
		List<EmployeeModel> e = db.getSalary();
		List<PaySlipView> list = new ArrayList<PaySlipView>();
		long[] daysOfMonth = new long[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (EmployeeModel e1 : e) {
			PaySlipView ps = new PaySlipView();
			long gross = e1.getGross();
			long basic = (long) (gross * 0.6);
			long hra = (long) (basic * 0.4);
			long variableAllowance = gross - basic - hra;
			long paydays = e1.getPayDays();
			long amount = basic + hra + variableAllowance;
			long attend = (long) (amount * ((double) paydays / (double) daysOfMonth[e1.getMonth() - 1]));
			ps.setEmployee(e1);
			ps.setGross(gross);
			ps.setBasic(basic);
			ps.setHra(hra);
			ps.setVariableAllowance(variableAllowance);
			ps.setAmount(attend);
			list.add(ps);
		}
		model.addAttribute("employeeView", list);
		return "paySlip";
	}
}