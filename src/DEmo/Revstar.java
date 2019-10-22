package DEmo;

public class Revstar 

	{
		public void rev()
		{
	for(int i=0;i<5;i++)
		{
		
	for(int j=4;j>=i;j--)
	{
		System.out.print(" ");
		
		}
	for(int s=0;s<i;s++)
	{
	System.out.print("*");
	}
	System.out.println();
	}
		}
	public static void main(String[] args) 
	{
	Revstar oo=new Revstar();
	oo.rev();
		// TODO Auto-generated method stub
		}
		}
