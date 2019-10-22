package StringDemo;

public class RevString 
{
	String str="mansi batra";
	int count=str.length();
	String rev="";
	
	public void rev()
	{
		System.out.println("The string is:"+str);
		System.out.println("The length of the string is:"+count);
for(int i=count-1;i>=0;i--)
{
	rev=rev+str.charAt(i);
	
	}
System.out.println("The reverse value of string is :"+rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RevString oo= new RevString();
		oo.rev();
	}

}
