package com.cg.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cms.dto.OrderRequest;
import com.cg.cms.entities.Customer;
import com.cg.cms.repository.ProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Customer placeOrder(OrderRequest request) {

		return null;
	}

}
