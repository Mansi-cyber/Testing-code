package DEmo;

public class starasdes {

	public static void printTrian()
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
starasdes oo=new starasdes();
oo.printTrian();
	}

}
