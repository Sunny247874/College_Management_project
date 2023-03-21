package college.Manage.project;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String args[])
{
	
	Faculty Suman=new Faculty("suman",201,745.23f);
	Faculty Surbhi=new Faculty("Surbhi",202,545.45f);
	Faculty Sasank=new Faculty("sasank",203,654.67f);
	
	List<Faculty> facultyList=new ArrayList<>();
	facultyList.add(Suman);
	facultyList.add(Surbhi);
	facultyList.add(Sasank);
	
	
	Student Ayush=new Student("Ayus kumar",2001326056,"5th-semeseter");
	Student Sharwan=new Student("Sharwan",2001326076,"5th-semster");
	Student Aditya=new Student("Aditya",2001326054,"5th-semster");
	
	
	List<Student> studentList=new ArrayList<>();
	studentList.add(Ayush);
	studentList.add(Sharwan);
	studentList.add(Aditya);
	
	
	System.out.println("Student Pay salary");
	System.out.println("-----------------------------------");
	
	College Giet=new College(studentList,facultyList);
	
	Ayush.giveFee(2000.53f);
	Sharwan.giveFee(1500.45f);
	Aditya.giveFee(2554.56f);
	
	System.out.println("Giet College Earn Begin registration ₹:"+Giet.getTotalMoneyEarned());
	
	System.out.println("------------------");
	
	System.out.println("Giet college give  Fee Pay all Faculty");
	
	System.out.println("-----------------");
	
	Suman.recieveSalary(Suman.getSalary());
	System.out.println("Giet College Give payment:"+Suman.getName()
	+" For Festival Enjoy ₹:"+Giet.getTotalMoneyEarned());
	
	Surbhi.recieveSalary(Surbhi.getSalary());
	System.out.println("Giet College Give Payment:"+Surbhi.getName()
	+" For Festival Celibration ₹:"+Giet.getTotalMoneyEarned());
	
	Sasank.recieveSalary(Sasank.getSalary());
	System.out.println("Giet College Give Payment:"+Sasank.getName()
	+" For festival Enjoy ₹:"+Giet.getTotalMoneyEarned());
	
	 
}
}
