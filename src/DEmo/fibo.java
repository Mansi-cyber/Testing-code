package DEmo;

public class fibo 
{
	int n1=0, n2=1,n,i;
	public void fib()
	{
	System.out.println(n1);
	
	}
	public void res()
	{

		for(i=0;i<=10;i++)
		{
			n=n1+n2;// n=0=01
			n2=n1;//1=1+1=2; 
			n1=n;
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
fibo oo= new fibo();
oo.fib();
oo.res();
	}

}
