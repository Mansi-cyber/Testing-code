package DEmo;

public class Duparr 
{
	int[] arr= {6,5,4,6,5,3,2};
	public void dup()
	{
	for(int i=0;i<arr.length;i++)
	{
		int temp=arr[i];
		
		for(int j=i+1;j<arr.length;j++)//To check with the next number; can not start with 0
		{
		int m=arr[j];
		if(temp==m)
		{
			System.out.println("Duplicate value is : "+temp);
			
			System.out.println("Position of Original value is:"+(i+1));
			System.out.println("Position of Duplicate value is:"+(j+1));
		}
		}
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Duparr oo=new Duparr();
oo.dup();
	}

}
