package college.Manage.project;

public class Faculty {

	private String name;
	private int id;
	private float salary;
	private float salaryEarned;
	
	/**
	 * 
	 * @param name:All the facalty unique Name
	 * @param id: All the Faculty Unique Id
	 * @param salary:Salary are Acpted By Faculty  
	 */
	
	public Faculty(String name,int id,float salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.salaryEarned=salaryEarned;
	}
	
	/**
	 * 
	 * @return: Get Name by User
	 */
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * 
	 * @return:get Id by User
	 */
	
	public int getId()
	{
		return id;
	}
	
	/**
	 * 
	 * @param salary: Salary is update Every Techer For Performance
	 */
	
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	
	/**
	 * 
	 * @return: salary Every Faculty
	 */
	
	public float getSalary()
	{
		return salary;
	}
	
	public void recieveSalary(float payment)
	{
		salaryEarned+=payment;
		College.updateTotalMoneySpend(payment);
	}
	
	
}
