package com.binh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.binh.entity.Role;


@Service
public interface Service_Role {
	List<Role> findAll();
}
