package com.cg.cms.service;

import org.springframework.stereotype.Service;

import com.cg.cms.dto.OrderRequest;
import com.cg.cms.entities.Customer;

@Service
public interface IProductService {

	Customer placeOrder(OrderRequest order);

}
