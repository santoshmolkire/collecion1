package com.college.util;
import com.college.pojo.College;
import com.college.pojo.Department;
import com.college.pojo.Professors;
import com.college.pojo.Student;
import com.college.pojo.Subjects;

public class CollegeInfo {

	public static College COEP=null;
	static {
		
		Professors propit=new Professors(121, "santy", 900000, "latur");
		Professors propcs=new Professors(122, "swati", 900000, "latur");
		Professors propec=new Professors(123, "swatish", 1600000, "pune");
		
		Professors [] itProfList= {propit};
		Professors [] csProfList= {propcs};
		Professors [] ecProfList= {propec};
		
		Subjects stmarks=new Subjects(56, 56, 67, 89);
		Subjects stmarks1=new Subjects(58, 66, 68, 79);
		Subjects stmarks2=new Subjects(59, 77, 65, 89);

		Student s1=new Student(111, "sr", stmarks, "latur");
		Student s2=new Student(222, "sm", stmarks1, "latur");
		Student s3=new Student(333, "ssrm", stmarks2, "pune");


		
		Student [] itStudent= {s1};
		Student [] csStudent= {s2};
		Student [] ecStudent= {s3};
		
		Department it=new Department(11, "Information Technology", 10, itProfList, itStudent);
		Department cs=new Department(12, "Computer Science", 11, csProfList, csStudent);
		Department ec=new Department(13, "Electronics", 12, ecProfList, ecStudent);
		
		Department [] listOfdepts = {it,cs,ec};
		
		//COEP = new College(1212, "COEP", listOfdepts);
}
}