package DEmo;

import java.util.Scanner;

public class Arrinp 
{
int []arr;
int size;//For taking input from user as length of the array required
Scanner sc=new Scanner(System.in);
public void inp()
{
System.out.print("Enter size for the array");
size=sc.nextInt();
arr=new int[size]; // Initialize the array
System.out.print("Enter values for the matrix");
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();	
}
System.out.println("The matrix is :");
for(int n=0;n<size;n++)
{
System.out.println(arr[n]);	
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Arrinp oo=new Arrinp();
oo.inp();
	}

}
