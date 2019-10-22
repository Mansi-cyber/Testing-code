package DEmo;

import java.util.Scanner;

public class TestDemo {
	int[] rollno= new int[5];
	int counter;
	Scanner s=new Scanner(System.in);
	public void acceptDet()
	{
		System.out.println(rollno.length);
	System.out.println("Enter numbers");
	for(counter=0;counter<5;counter++)
	{
	rollno[counter]=s.nextInt();	
	}
	for(int n=0;n<5;n++)	
	{
		System.out.println(rollno[n]);
	}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			TestDemo oo=new TestDemo();
	oo.acceptDet();
		}

	

}
