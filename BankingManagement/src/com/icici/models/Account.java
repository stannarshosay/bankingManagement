package com.icici.models;

public class Account {
	
	private int type;
	private String name;
	
	public static final int CURRENT_ACCOUNT = 1;
	public static final int SAVINGS_ACCOUNT = 2;
	
	public Account() {
	}
	
	public Account(int type, String name) {
		this.type = type;
		this.name = name;
	}
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
