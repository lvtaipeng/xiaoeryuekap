package com.lvtaipeng.entity;

import java.util.Date;

public class Car {

	private Integer id;
	private String t1;
	
	private int cart2;
	
	private Date data;
	
	private Double price1;
	
	private Double price2;
	
	private String url;
	
	private Integer tid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getT1() {
		return t1;
	}

	public void setT1(String t1) {
		this.t1 = t1;
	}

	public int getCart2() {
		return cart2;
	}

	public void setCart2(int cart2) {
		this.cart2 = cart2;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getPrice1() {
		return price1;
	}

	public void setPrice1(Double price1) {
		this.price1 = price1;
	}

	public Double getPrice2() {
		return price2;
	}

	public void setPrice2(Double price2) {
		this.price2 = price2;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Car(Integer id, String t1, int cart2, Date data, Double price1, Double price2, String url, Integer tid) {
		super();
		this.id = id;
		this.t1 = t1;
		this.cart2 = cart2;
		this.data = data;
		this.price1 = price1;
		this.price2 = price2;
		this.url = url;
		this.tid = tid;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", t1=" + t1 + ", cart2=" + cart2 + ", data=" + data + ", price1=" + price1
				+ ", price2=" + price2 + ", url=" + url + ", tid=" + tid + "]";
	}
	
	
	
}
