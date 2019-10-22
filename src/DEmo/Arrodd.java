package  DEmo;

public class Arrodd {
	int[] arr= {5,4,3,2,1};
	int a,temp;
	public void odd()
	{
	for(a=0;a<arr.length;a++)
	{
		temp=arr[a];
		if(temp%2==0)
		{
			System.out.println("Even number : "+temp);
		}
		else
		{
			System.out.println("Odd number :"+temp);
		}
	
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Arrodd oo=new Arrodd();
oo.odd();
	}

}
