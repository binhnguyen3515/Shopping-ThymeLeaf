package com.binh.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.binh.entity.Account;
import com.binh.entity.Authority;

@Repository
public interface DAO_Authority extends JpaRepository<Authority, Integer>{

	@Query("Select Distinct a From Authority a where a.account IN ?1")
	List<Authority> authoritiesOf(List<Account> accounts);

	@Query("Select a From Authority a where a.account.username like ?1")
	List<Authority> getOneByRole(String username);

	@Transactional
	@Modifying
	@Query("Delete from Authority where Username = ?1")
	void deleteByUserName(String username);

}
