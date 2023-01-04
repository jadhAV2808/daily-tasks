package com.hashtable;

public class Emp {
	
	private int id;
	private String fname;
	private String lname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}
	public Emp(int id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
