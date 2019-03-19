package com.college.pojo;

public class Student {

	private int studentId;
	private String studentName;
	private Subjects studentsubjects;
	private String studentAddress;
	
	public Student(int studentId, String studentName, Subjects studentsubjects, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentsubjects = studentsubjects;
		this.studentAddress = studentAddress;
	}
	
	
	public Student() {
		super();
	}


	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Subjects getStudentsubjects() {
		return studentsubjects;
	}
	public void setStudentsubjects(Subjects studentsubjects) {
		this.studentsubjects = studentsubjects;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentsubjects="
				+ studentsubjects + ", studentAddress=" + studentAddress + "]";
	}
}
