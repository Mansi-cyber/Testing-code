package InheritanceAssg;

import java.util.Scanner;

public class Assignment {
	int empId;
	String empName;
	int total_leaves;
	double total_salary;
	Scanner sc=new Scanner(System.in);
	
	void calculate_balance_leaves()
	{
		System.out.println("Enter the balance leaves :"+total_leaves);
		total_leaves=sc.nextInt();
		System.out.println("The balance leaves are :");
	}
	boolean avail_leave(boolean no_of_leaves, boolean type_of_leave)
	{
		return no_of_leaves;
	}
	void calculate_salary()
	{
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment oo=new Assignment();
		oo.calculate_balance_leaves();
	}

}
