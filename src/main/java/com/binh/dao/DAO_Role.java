package com.binh.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.binh.entity.Role;

@Repository
public interface DAO_Role extends JpaRepository<Role, String>{

}
