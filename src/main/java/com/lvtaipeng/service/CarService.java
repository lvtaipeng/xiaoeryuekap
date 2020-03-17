package com.lvtaipeng.service;

import java.util.List;

import com.lvtaipeng.entity.Car;

public interface CarService {


	List<Car> list();
	
	int add(Car c);
	
	int update(Car c);
}
