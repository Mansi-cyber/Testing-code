package StringDemo;


public class Palindrome 
{
	String str="madam";
int count=str.length();
String rev="";

public void rev()
{
	System.out.println("The string is:"+str);
for(int i=count-1;i>=0;i--)
{
rev=rev+str.charAt(i);

}
System.out.println("The reverse value of string is :"+rev);

if(str.equals(rev))
{
	System.out.println("The word is palindrome");
}
else
{
System.out.println("Not a palindrome");	
}
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Palindrome oo= new Palindrome();
	oo.rev();
}
}