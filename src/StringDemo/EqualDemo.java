package StringDemo;

import java.util.Scanner;

public class EqualDemo {
String loginid;
String pass;
int count;
Scanner sc=new Scanner(System.in);

public void checklogin()
{
System.out.println("Enter Login id");
loginid=sc.nextLine();


System.out.println("Enter Password");
pass=sc.nextLine();
count=pass.length();
System.out.println("Length of password "+count);
if(loginid.equals("admin")&&pass.equals("admin"))
{
System.out.println("Valid user");
}
else
{
System.out.println("Invalid user");	
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
EqualDemo oo=new EqualDemo();
oo.checklogin();
	}

}
