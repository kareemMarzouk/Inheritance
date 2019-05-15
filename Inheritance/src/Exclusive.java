public class Exclusive extends Manager
{
	//new variable
	double yearlyBonus;
	
	
	
	//Constructor
	public Exclusive(String name, double salary, double dept, double yearlyBonus) 
	{
		super(name, salary, dept);
		this.yearlyBonus = yearlyBonus;
	}




	//Getters and Setters
	public double getYearlyBonus() 
	{
		return yearlyBonus;
	}

	public void setYearlyBonus(double yearlyBonus) 
	{
		this.yearlyBonus = yearlyBonus;
	}


	//override toString()
	public String toString() 
	{
		return "\nname: " + name + "\nsalary: $" + salary + "\ndept: $" + dept + "\nyearly bonus: $" + yearlyBonus;
	}

}
