package college.Manage.project;

import java.util.List;

public class College {

	private List<Student> students;
	private List<Faculty> faculties;
	private static float totalMoneyEarned;
	private static float totalMoneySpend;
	
	
	public College(List<Student> students,List<Faculty> faaculties)
	{
		this.students=students;
		this.faculties=faculties;
		totalMoneyEarned=0.0f;
		totalMoneySpend=0.0f;
	}
	
	
	public void addStudent(Student student)
	{
		students.add(student);
	}
	
	public List<Student> getStudents()
	{
		return students;
	}
	
	public void addFaculty(Faculty faculty)
	{
		faculties.add(faculty);
	}
	
	public List<Faculty> getFaculties()
	{
		return faculties;
	}
	
	
	public  static void updateTotalMoneyEarned(float MoneyEarned)
	{
		totalMoneyEarned+=MoneyEarned;
	}
	
	public float getTotalMoneyEarned()
	{
		return totalMoneyEarned;
	}
	
	
	public  static void updateTotalMoneySpend(float MoneySpend)
	{
		totalMoneyEarned-=MoneySpend;
	}
	
	public float getTotalMoneySpend()
	{
		return totalMoneySpend;
	}
}
