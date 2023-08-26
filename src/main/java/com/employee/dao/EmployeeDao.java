package com.employee.dao;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.employee.model.EmployeeModel;
import com.employee.model.EmployeeRowMapper;

@Repository
public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public EmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public String saveDetails(EmployeeModel emp) {
		String ids = "select COUNT(*) from EmployeeDetails where id=?";
		int rowCount = jdbcTemplate.queryForObject(ids, Integer.class, emp.getId());

		if (rowCount <= 0) {
			String sql = "INSERT INTO EmployeeDetails (id, name, email, gender, designation, number, gross, payDays, month) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			jdbcTemplate.update(sql, emp.getId(), emp.getName(), emp.getEmail(), emp.getGender(), emp.getDesignation(),
					emp.getNumber(), emp.getGross(), emp.getPayDays(), emp.getMonth());
		} else {
			System.out.println(rowCount);
			return "error";
		}
		return "Success";
	}

	public List<EmployeeModel> getSalary() {
		String sql = " SELECT id, name, gender, designation, number, email, gross, payDays, month from EmployeeDetails";
		return jdbcTemplate.query(sql, new EmployeeRowMapper());
	}
}