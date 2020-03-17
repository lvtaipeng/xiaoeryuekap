package com.lvtaipeng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lvtaipeng.dao.CarDao;
import com.lvtaipeng.entity.Car;
import com.lvtaipeng.service.CarService;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarDao dao;

	@Override
	public List<Car> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}

	@Override
	public int add(Car c) {
		// TODO Auto-generated method stub
		return dao.add(c);
	}

	@Override
	public int update(Car c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}
}
