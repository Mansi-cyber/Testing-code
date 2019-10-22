package Polymorphism;

public class Overloading {// Overloading
final double pie=3.14;
double a;
	public void area(float x)
	{
		System.out.println("Area of square is :"+x*x+"sq units");
		
	}
	public void area(float x,float y)
	{
		System.out.println("Area of recatngle is :"+x*y+"sq units");
		
	}
	public void area(double z)
	{
		
		
		
		System.out.println("Area of circle is "+ pie*z*z +"sq units");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading  oo= new Overloading ();
	oo.area(5);
	oo.area(3,2);
	oo.area(6.0);
	}

}
