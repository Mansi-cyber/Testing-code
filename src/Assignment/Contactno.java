package Assignment;

import java.util.Scanner;

public class Contactno {
Scanner sc=new Scanner(System.in);
long arr[]={8427088479l};

public void check()
 {
	 System.out.println("The contact no is : "+arr);
	for(int i=0;i<arr.length;i++)
	{
		long temp=arr[i];
		for(int j=i+1;j<=arr.length;j++)
		{
			long temp1=arr[j];
			if(temp==temp1)
			{
				System.out.println("Duplicate number is "+temp1);

				System.out.println("Position of original number is :"+(i+1));
				
				System.out.println("Position of duplicate number is :"+(j+1));
				
			}
		}
		
	}
	
	
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Contactno oo= new Contactno();
oo.check();

	}

}
