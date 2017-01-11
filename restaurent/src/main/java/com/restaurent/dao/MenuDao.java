package com.restaurent.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.restaurent.model.Menu;
import com.restaurent.util.ConnectionUtil;

public class MenuDao {
	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public void save(Menu menu) {

		String sql = "insert into menu(id,name) values(?,?)";
		Object[] params = { menu.getId(), menu.getName() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);

	}
}

	

