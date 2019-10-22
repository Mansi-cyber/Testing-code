package InheritanceDemo;

import java.util.Scanner;

public class StudentDemo {
int rollno;
String name;
long contact;
Scanner sc=new Scanner(System.in);
public void acceptDetails()
{
	System.out.println("Enter RollNO");
	rollno=sc.nextInt();
			
	System.out.println("Enter NAme");
	name=sc.next();
			
	System.out.println("Enter Contact No");
	contact=sc.nextInt();
	
	}

public void Display()
{
System.out.println("Roll No is:"+rollno);
System.out.println("Name is:"+name);
System.out.println("Contact is:"+contact);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentDemo oo=new StudentDemo();
oo.acceptDetails();
	}

}
