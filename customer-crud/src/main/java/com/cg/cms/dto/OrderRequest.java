package com.cg.cms.dto;

import com.cg.cms.entities.Customer;

import lombok.Data;
import lombok.NoArgsConstructor;

//Its not enity class, so don't write @Entity annotation
@Data
@NoArgsConstructor
public class OrderRequest {
	private Customer customer;
}
