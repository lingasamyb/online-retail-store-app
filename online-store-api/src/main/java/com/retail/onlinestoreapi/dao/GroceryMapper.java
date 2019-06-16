package com.retail.onlinestoreapi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.retail.onlinestoreapi.pojo.Grocery;

public class GroceryMapper implements RowMapper<Grocery> {

	public GroceryMapper() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Grocery mapRow(ResultSet rs, int arg1) throws SQLException {
		Grocery grocery = new Grocery();
		grocery.setName(rs.getString("name"));
		grocery.setQuality(rs.getInt("quality"));
		grocery.setWeight(rs.getInt("weight"));
		grocery.setPrice(rs.getInt("price"));
		grocery.setImage(rs.getString("image"));

		return grocery;
	}

}
