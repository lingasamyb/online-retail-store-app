package com.retail.onlinestoreapi.dao;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.retail.onlinestoreapi.pojo.Customer;
import com.retail.onlinestoreapi.pojo.Grocery;
import com.retail.onlinestoreapi.pojo.Mobile;

@Repository
public class CustomerDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Customer getCustomer(Customer customerId) {
		List<Customer> customers = jdbcTemplate.query(
				"select * from osp.customer c where c.customer_id= '" + customerId.getCustomerId() + "'",
				new CustomerMapper());
		return customers.get(0);
	}

	public void registerNewCustomer(Customer customer) {
		LocalDate todayDate = LocalDate.now();
		jdbcTemplate.update("insert  into osp.customer values ('" + customer.getFirstName() + "','"
				+ customer.getLastName() + "','" + customer.getMobileNumber() + "','" + customer.getCustomerId() + "','"
				+ customer.getPassword() + "','" + todayDate + "')");
	}

	public List<Mobile> requestProductDetails() {
		List<Mobile> mobiles = jdbcTemplate.query("select * from osp.mobiles", new MobileMapper());
		return mobiles;
	}

	public Mobile getProductDetails(String mobileId) {
		List<Mobile> mobile = jdbcTemplate.query("select * from osp.mobiles where mobile_id='" + mobileId + "'",
				new MobileMapper());
		return mobile.get(0);
	}

	public List<Mobile> getCartProducts(String customerId) {
		List<Mobile> mobiles = jdbcTemplate.query("select * from osp.shopping_cart sc inner join osp.mobiles m "
				+ "on sc.mobile_id = m.mobile_id where customer_id='" + customerId + "'", new MobileMapper());
		return mobiles;
	}

	public List<Mobile> searchMobiles(String searchMobile) {
		List<Mobile> mobiles = jdbcTemplate
				.query("select * from osp.mobiles where lower(brand) = lower('"
						+ searchMobile + "')", new MobileMapper());
		return mobiles;
	}

	public int addToCartList(String customerId, String mobileId) {
		String cartId = customerId.substring(0, 3).concat(mobileId.substring(0));
		int response = jdbcTemplate.update(
				"insert into osp.shopping_cart values('" + cartId + "','" + customerId + "','" + mobileId + "')");
		return response;
	}

	public void deleteCartProduct(String customerId, String mobileId) {
		jdbcTemplate.update("delete from osp.shopping_cart where customer_id = '" + customerId + "' and mobile_id= '"
				+ mobileId + "'");
	}
	public List<Grocery> getGroceryProducts(){
		List<Grocery> groceryProducts = jdbcTemplate.query("select * from osp.grocery", new GroceryMapper());
		return groceryProducts;
	}

}
