package com.binh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.binh.dao.DAO_Category;
import com.binh.entity.Category;
import com.binh.service.Service_Category;

@Service
public class ServiceImpl_Category implements Service_Category{
	@Autowired private DAO_Category cateDao;

	@Override
	public List<Category> findAll() {
		return cateDao.findAll();
	}
}
