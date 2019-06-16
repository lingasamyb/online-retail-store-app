
package com.retail.onlinestoreapi.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.retail.onlinestoreapi.dao.CustomerDAO;
import com.retail.onlinestoreapi.pojo.Customer;
import com.retail.onlinestoreapi.pojo.Grocery;
import com.retail.onlinestoreapi.pojo.Mobile;

@RestController
public class CustomerController {

	@Autowired
	private CustomerDAO customerDAO = null;

	@CrossOrigin
	@GetMapping("/customers/{customerId}")
	public Customer getCustomer(@PathVariable String customerId, final HttpServletResponse resp) {
		resp.setHeader("Access-Control-Allow-Origin", "*");
		Customer customer = customerDAO.getCustomer(new Customer(customerId + ".com"));
		return customer;
	}

	@CrossOrigin
	@PostMapping("/register")
	public void registerCustomerDetails(@RequestBody Map<String, Object> customerJson) {
		Map<String, String> customer = (Map<String, String>) customerJson.get("customer");
		customerDAO.registerNewCustomer(new Customer(customer.get("firstName"), customer.get("lastName"),
				customer.get("mobileNumber"), customer.get("customerId"), customer.get("password")));
	}

	@CrossOrigin
	@GetMapping("/products")
	public List<Mobile> getProducts() {
		List<Mobile> mobiles = customerDAO.requestProductDetails();
		return mobiles;
	}

	@CrossOrigin
	@GetMapping("/show-details/{mobileId}")
	public Mobile showProducts(@PathVariable String mobileId) {
		Mobile mobile = customerDAO.getProductDetails(mobileId);
		return mobile;
	}

	@CrossOrigin
	@GetMapping("/cart-details/{customerId}")
	public List<Mobile> getCartProducts(@PathVariable String customerId) {
		List<Mobile> mobiles = customerDAO.getCartProducts(customerId + ".com");
		return mobiles;
	}

	@CrossOrigin
	@GetMapping("/search-mobile/{searchMobile}")
	public List<Mobile> searchMobiles(@PathVariable String searchMobile) {
		List<Mobile> mobiles = customerDAO.searchMobiles(searchMobile);
		System.out.println("Api print\n" + mobiles);
		return mobiles;
	}

	@CrossOrigin
	@GetMapping("/add-cart/{customerId}/{mobileId}")
	public int addToCartList(@PathVariable String customerId, @PathVariable String mobileId) {
		int response = customerDAO.addToCartList(customerId, mobileId);
		return response;
	}

	@CrossOrigin
	@DeleteMapping("/delete-cart/{customerId}/{mobileId}")
	public void deleteCartProduct(@PathVariable String customerId, @PathVariable String mobileId) {
		customerDAO.deleteCartProduct(customerId, mobileId);
	}
	@CrossOrigin
	@GetMapping("/grocery-products")
	public List<Grocery> getGroceryProducts() {
		List<Grocery> groceryProducts = customerDAO.getGroceryProducts();
		return groceryProducts;
	}
}
