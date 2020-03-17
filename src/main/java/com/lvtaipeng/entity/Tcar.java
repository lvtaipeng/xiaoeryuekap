package com.lvtaipeng.entity;

public class Tcar {

	private Integer id;
	
	private String type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Tcar(Integer id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Tcar [id=" + id + ", type=" + type + "]";
	}
	
	
}
