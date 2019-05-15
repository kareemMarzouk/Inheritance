import java.util.Scanner;

public class EmployeeTest 
{

	public static void main(String[] args) 
	{
		//read user input
		Scanner input = new Scanner(System.in);
		Employee employee1 = new Employee("", 0);
		Manager manager1 = new Manager("", 0, 0);
		Exclusive exclusive1 = new Exclusive("", 0, 0, 0);
		
		//Ask user to input info
		System.out.println("\nEmployee");
		System.out.println("\n--------------------");
		
		System.out.println("\nEnter Name: ");
		String employeeName = input.nextLine();
		employee1.setName(employeeName);
		
		System.out.println("\nEnter Salary: ");
		double employeeSalary = input.nextDouble();
		employee1.setSalary(employeeSalary);
		
		
		System.out.println("\nManager");
		System.out.println("\n--------------------");
		String space2 = input.nextLine();
		
		
		System.out.println("\nEnter Name: ");
		String managerName = input.nextLine();
		manager1.setName(managerName);
		
		System.out.println("\nEnter Salary: ");
		double managerSalary = input.nextDouble();
		manager1.setSalary(managerSalary);
		
		System.out.println("\nEnter Debt: ");
		double managerDept = input.nextDouble();
		manager1.setDept(managerDept);
		
		System.out.println("\nExclusive");
		System.out.println("\n--------------------");
		String space3 = input.nextLine();
		
		System.out.println("\nEnter Name: ");
		String exclusiveName = input.nextLine();
		exclusive1.setName(exclusiveName);
		
		System.out.println("\nEnter Salary: ");
		double exclusiveSalary = input.nextDouble();
		exclusive1.setSalary(exclusiveSalary);
		
		System.out.println("\nEnter Debt: ");
		double exclusiveDebt = input.nextDouble();
		exclusive1.setDept(exclusiveDebt);
		
		System.out.println("\nEnter Yearly Bonus: ");
		double exclusiveYearlyBonus = input.nextDouble();
		exclusive1.setYearlyBonus(exclusiveYearlyBonus);
		
		System.out.println("\n....................");
		
		//summary message
		System.out.println("\nSummary:");
		System.out.printf("\nEmployee %s%n", employee1.toString());
		System.out.println("\n--------------------");
		System.out.printf("\nManager %s%n", manager1.toString());
		System.out.println("\n--------------------");
		System.out.printf("\nExclusive %s%n", exclusive1.toString());
		
	}

}
