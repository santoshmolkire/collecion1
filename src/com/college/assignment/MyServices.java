package com.college.assignment;

import com.college.pojo.Department;
import com.college.pojo.Student;

public abstract class MyServices {
	abstract public Student[] getAllStudentsIrrepectiveOfDepts();
	abstract public double getAllProfessorSalary();
	abstract public String getMaxSalaryPayingDept();
	abstract public Department[] getAllDeptsWhoseStudsAreFailed();
	abstract public double getDeptScore(int deptId);
	abstract public String[] getHighesPaidFacultiesAllDept();	
}
