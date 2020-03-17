package com.lvtaipeng.dao;

import java.util.List;

import com.lvtaipeng.entity.Car;

public interface CarDao {

	List<Car> list();
	
	int add(Car c);
	
	int update(Car c);
}
