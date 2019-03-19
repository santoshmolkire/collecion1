package com.college.pojo;

import java.util.Arrays;

public class Department {
	
	private int departmentId;
	private String departmentName;
	private int depcode;
	private Professors listofProfessor[];
	private Student listofstudents[];
	
	public Department(int departmentId, String departmentName, int depcode, Professors[] listofProfessor,
			Student[] listofstudents) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.depcode = depcode;
		this.listofProfessor = listofProfessor;
		this.listofstudents = listofstudents;
	}
	
	public Department() {
		super();
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getDepcode() {
		return depcode;
	}

	public void setDepcode(int depcode) {
		this.depcode = depcode;
	}

	public Professors[] getListofProfessor() {
		return listofProfessor;
	}

	public void setListofProfessor(Professors[] listofProfessor) {
		this.listofProfessor = listofProfessor;
	}

	public Student[] getListofstudents() {
		return listofstudents;
	}

	public void setListofstudents(Student[] listofstudents) {
		this.listofstudents = listofstudents;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", depcode="
				+ depcode + ", listofProfessor=" + Arrays.toString(listofProfessor) + ", listofstudents="
				+ Arrays.toString(listofstudents) + "]";
	}
	
}
