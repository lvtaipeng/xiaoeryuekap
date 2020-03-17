package com.lvtaipeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lvtaipeng.service.CarService;

@Controller
public class CarController {

	
	@Autowired
	private CarService service;
	
	@RequestMapping("/list")
	public String list() {
		
		return "list";
	}
	@RequestMapping("/add")
	public String add() {
		
		return "add";
	}
	@RequestMapping("/update")
	public String update() {
		
		return "update";
	}
}
