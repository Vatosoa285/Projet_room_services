package fr.insa.mas.studentManagementMS.model;

import java.util.ArrayList;

public class StudentList {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arrayList = new ArrayList<Student>();  	
	    Student student1 =new Student(1,"Rosa","Parks");
	    Student student2 =new Student(2,"Marie","Mi");
	    arrayList.add(student1);
	    arrayList.add(student2);
		System.out.println("ArrayList  : " + arrayList);
	}

}
