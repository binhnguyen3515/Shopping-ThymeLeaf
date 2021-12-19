package com.binh.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.binh.entity.OrderDetail;

@Repository
public interface DAO_OrderDetail extends JpaRepository<OrderDetail, Long>{

}
