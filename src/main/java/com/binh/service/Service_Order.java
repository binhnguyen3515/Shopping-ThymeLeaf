package com.binh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.binh.entity.Order;
import com.fasterxml.jackson.databind.JsonNode;


@Service
public interface Service_Order {
	Order create(JsonNode orderData);

	Order findById(Long id);

	List<Order> findByUsername(String username);

	Long getToDayOrder();

	Long totalOrder();

	List<Object[]> getRevenueLast7Days();
}
