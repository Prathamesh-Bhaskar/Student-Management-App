package com.student.manage;

public class Student {
 private int StudentId;
 private String StudentName;
 private String StudentPhone;
public Student(int studentId, String studentName, String studentPhone) {
	super();
	StudentId = studentId;
	StudentName = studentName;
	StudentPhone = studentPhone;
}
public Student(String studentName, String studentPhone) {
	super();
	StudentName = studentName;
	StudentPhone = studentPhone;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getStudentId() {
	return StudentId;
}
public void setStudentId(int studentId) {
	StudentId = studentId;
}
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	StudentName = studentName;
}
public String getStudentPhone() {
	return StudentPhone;
}
public void setStudentPhone(String studentPhone) {
	StudentPhone = studentPhone;
}

public String toString() {
	return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentPhone=" + StudentPhone + "]";
}
}