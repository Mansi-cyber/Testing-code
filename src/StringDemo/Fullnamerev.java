package StringDemo;

public class Fullnamerev 

	{
		String str="mansi batra";
		int count=str.length();
		String st[];
		String st1;
		String rev="";
		String rev1="";		
		public void rev()
		{
			System.out.println("The string is:"+str);
			System.out.println("The length of the string is:"+count);
			st=str.split(" ");
			st1=st[0]+st[1];

			String temp=st[0];
			int s=temp.length();
			for(int i=s-1;i>=0;i--)
			{	
				rev=rev+st[0].charAt(i);
				
				}

			String temp1=st[1];
			int t=temp1.length();
			for(int i=t-1;i>=0;i--)
			{
				
				rev1=rev1+st[1].charAt(i);
				
				}
			System.out.println("The reverse string is:");
			System.out.println(rev+" "+rev1);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Fullnamerev  oo= new Fullnamerev();
			oo.rev();
		}

	}
