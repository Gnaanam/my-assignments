package student.inheritance;

import department.inheritance.Department;

public class Student extends Department {
	public void studentName() {
		// TODO Auto-generated method stub
    System.out.println("Deivanai Sathappan");
	}
	public void studentDept() {
		// TODO Auto-generated method stub
    System.out.println("EEE");
	}
	public void studentId() {
		// TODO Auto-generated method stub
    System.out.println("1345");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student obj=new Student();
    obj.collegeCode();
    obj.collegeName();
    obj.collegeRank();
    obj.deptName();
    obj.studentDept();
    obj.studentName();
    obj.studentId();
	}

}
