package com.college.pojo;

public class Professors {
	
	private int profeId;
	private String profeName;
	private double profeSalary;
	private String profeAddress;
	
	public Professors(int profeId, String profeName, double profeSalary, String profeAddress) {
		super();
		this.profeId = profeId;
		this.profeName = profeName;
		this.profeSalary = profeSalary;
		this.profeAddress = profeAddress;
	}
	public Professors() {
		super();
	}
	public int getProfeId() {
		return profeId;
	}
	public void setProfeId(int profeId) {
		this.profeId = profeId;
	}
	public String getProfeName() {
		return profeName;
	}
	public void setProfeName(String profeName) {
		this.profeName = profeName;
	}
	public double getProfeSalary() {
		return profeSalary;
	}
	public void setProfeSalary(double profeSalary) {
		this.profeSalary = profeSalary;
	}
	public String getProfeAddress() {
		return profeAddress;
	}
	public void setProfeAddress(String profeAddress) {
		this.profeAddress = profeAddress;
	}
	
	@Override
	public String toString() {
		return "Professor [profeId=" + profeId + ", profeName=" + profeName + ", profeSalary=" + profeSalary
				+ ", profeAddress=" + profeAddress + "]";
	}
	
}
