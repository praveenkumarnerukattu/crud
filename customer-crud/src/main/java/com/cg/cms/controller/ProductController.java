package com.cg.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.cms.dto.OrderRequest;
import com.cg.cms.entities.Customer;
import com.cg.cms.service.CustomerServiceImpl;
import com.cg.cms.service.ProductServiceImpl;

@RestController
@RequestMapping("products")
public class ProductController {

	@Autowired
	private ProductServiceImpl productService;

	@Autowired
	private CustomerServiceImpl customerService;

	@PostMapping("placeOrder")
	public Customer saveOrder(@RequestBody OrderRequest order) {
		return customerService.addCustomer(order.getCustomer());
	}

	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders() {
		return customerService.fetchAll();
	}


}
