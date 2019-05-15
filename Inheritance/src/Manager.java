public class Manager extends Employee //inherits from Employee class
{

	//new variable
	double dept;
	
	//Constructor
	public Manager(String name, double salary, double dept) 
	{
		super(name, salary);
		this.dept = dept;
	}


	//Getters and setters 	
	public double getDept() 
	{
		return dept;
	}


	public void setDept(double dept) 
	{
		this.dept = dept;
	}







	//Override toString()
	public String toString() 
	{
		return "\nname: " + name + "\nsalary: $" + salary + "\ndept: $" + dept;
	}


}
