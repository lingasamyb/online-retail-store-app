/**
 * 
 */
package com.retail.onlinestoreapi.dao;

import java.sql.ResultSet; 
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.retail.onlinestoreapi.pojo.Customer;

/**
 * @author sp
 *
 */
public class CustomerMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet resultSet, int arg1) throws SQLException {
		Customer customer = new Customer();
		customer.setFirstName(resultSet.getString("FIRST_NAME"));
		customer.setLastName(resultSet.getString("LAST_NAME"));
		customer.setMobileNumber(resultSet.getString("MOBILE_NUMBER"));
		customer.setCustomerId(resultSet.getString("CUSTOMER_ID"));
		customer.setPassword(resultSet.getString("PASSWORD"));
		return customer;
	}

}
