public class Employee 
{
	//variables
	String name;
	double salary;
	
	//Constructor
	public Employee(String name, double salary) 
	{
		this.name = name;
		this.salary = salary;
	}
	
	
	
	//Getters and setters
	public String getName() 
	{
		return name;
	}


	public void setName(String name) 
	{
		this.name = name;
	}


	public double getSalary() 
	{
		return salary;
	}


	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

	
	//toString() return method
	public String toString()
	{
		return "\nName:" + name + "\nSalary: $" + salary;
		
	}

	
	

}
