package com.binh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.binh.entity.Account;


@Service
public interface Service_Account {
	Account findById(String username);

	List<Account> getAdministrators();

	List<Account> findAll();

	Account create(Account account);

	Account update(Account account);

	Long getTotalAccount();

	List<Object[]> top10Customer();
}
