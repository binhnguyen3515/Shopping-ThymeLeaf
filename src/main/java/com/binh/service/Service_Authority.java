package com.binh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.binh.entity.Account;
import com.binh.entity.Authority;


@Service
public interface Service_Authority {
	List<Authority> findAuthoritiesOfAdministrators();

	List<Authority> findAll();

	Authority create(Authority auth);

	void delete(Integer id);

	List<Authority> getOneByRole(String username);

	void deleteByUsername(String username);

	Long getTotalCustomer();

}
