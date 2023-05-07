package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("pramila");
	}
	public void studentDepartment() {
		System.out.println("ECE Department");
}
	public void studentId() {
		System.out.println("15ece035");
}
public static void main(String[] args) {
	Student stu =new Student();
	stu.collegeName();
	stu.collegeCode();
	stu.collegeRank();
	stu.departmentName();
	stu.studentName();
	stu.studentDepartment();
	stu.studentId();
}	
}