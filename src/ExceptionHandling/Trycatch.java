package ExceptionHandling;
import java.io.IOException; 


public class Trycatch {
	int age=17;
	public void throw1() throws IOException // Throws block
	{
		if(age<18)
		{
			throw new ArithmeticException("Not valid");// throw block
		}
		else
		{
			System.out.println("You can vote");
		}
	}

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Trycatch oo=new Trycatch();
		oo.throw1();
		try //try block
{
	int i =10,j=0,res;

	res= i/j;
	System.out.println("Result is "+res);
}
catch(ArithmeticException e) // catch block
{
	System.out.println(e);
	System.out.println("No can not be divisible by zero");
	System.out.println("Enter new value for divisor except 0");

	
}
		finally // finally block
		{
			System.out.println("This is a finally block");
			
		}
		
		
		
System.out.println("The function is not formed");
	}

}
