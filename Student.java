package college.Manage.project;

public class Student {

	private String name;
	private   int rollNo;
	private   String semster;
	private   float FeePaid;
	private   float totalFee;
	
	/**
	 *  define instance variable and local variable
	 * @param name: Define Unique Name
	 * @param rollNo: Define a Unqiue All student RollNo
	 * @param semster: Semster are define all student
	 */
	
	
	public  Student(String name,int rollNo, String semster)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.semster=semster;
		this.FeePaid=0.0f;
		this.totalFee=120000.50f;
	}
  	
	
	
	/**
	 * 
	 * @param semster:Update Every 6 mont after Semster
	 */
	
	public  void setSemester(String semster )
	{
		this.semster=semster;
	}
	
	/**
	 * 
	 * @return: Update After Return Semster Every Student 
	 */
	public String getSemster()
	{
		return semster;
	}
	
	/**
	 * 
	 * @return: RollNo Every Student
	 */
	
	public int getRollNo()
	{
		return rollNo;
	}
	
	/**
	 * 
	 * @return: Every Student Unique Name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * 
	 * @return:By Student Give fee Paid in College
	 */
	public float getFeePaid()
	{
		return FeePaid;
	}
	
	/**
	 * 
	 * @return:Total Fee of Student 
	 */
	public float getTotalFee()
	{
		return totalFee;
	}
	
	public void giveFee(float fee)
	{
		FeePaid+=fee;
		College.updateTotalMoneyEarned(FeePaid);
	}
	/**
	 * 
	 * @return: Remaning All the Fee
	 */
	public float getRemaningFee()
	{
		return totalFee-FeePaid;
	}
	
	
}
