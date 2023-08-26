package com.employee.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<EmployeeModel> {

	@Override
	public EmployeeModel mapRow(ResultSet rs, int rowNum) throws SQLException {

		return new EmployeeModel(
				rs.getInt("id"),
				rs.getString("name"),
				rs.getString("gender"),
				rs.getString("designation"),
				rs.getLong("number"),
				rs.getString("email"),
				rs.getLong("gross"),
				rs.getLong("payDays"),
				rs.getInt("month"));
	}

}
