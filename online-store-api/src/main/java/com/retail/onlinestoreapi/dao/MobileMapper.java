package com.retail.onlinestoreapi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.retail.onlinestoreapi.pojo.Mobile;

public class MobileMapper implements RowMapper<Mobile> {

	public MobileMapper() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Mobile mapRow(ResultSet rs, int arg1) throws SQLException {
		Mobile mobile = new Mobile();
		mobile.setBrand(rs.getString("brand"));
		mobile.setModel(rs.getString("model"));
		mobile.setPrice(rs.getInt("Price"));
		mobile.setMobileId(rs.getString("Mobile_Id"));
		mobile.setScreenSize(rs.getFloat("Screen_size"));
		mobile.setIntMemory(rs.getInt("Int_Mem"));
		mobile.setExtMemory(rs.getInt("Ext_Mem"));
		mobile.setBatCapacity(rs.getInt("Battery_Cap"));
		mobile.setImage(rs.getString("Image"));
		return mobile;
	}

}
