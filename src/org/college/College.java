package org.college;

public class College
{
	public void collegeName()
	{
		System.out.println("Imayam College");
	}
	public void collegeCode()
	{
		System.out.println("758");
	}
	public void collegeRank()
	{
		System.out.println("6th Rank");
	}
	public static void main(String args[])
	{
		College inf=new College();
		inf.collegeName();
		inf.collegeCode();
		inf.collegeRank();
		
		Student stu=new Student();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		
		Hostel name=new Hostel();
		name.hostelName();
		
		Dept de=new Dept();
		de.deptName();
		
	}

}
