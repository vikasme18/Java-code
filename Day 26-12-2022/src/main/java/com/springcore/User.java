package com.springcore;

public class User {
	private int id;
	private String uname;
	
	public User() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + "]";
	}
	
}
