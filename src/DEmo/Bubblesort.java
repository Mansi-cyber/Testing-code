package DEmo;

public class Bubblesort
{
int[] arr= {5,4,3,2,1}; 
	int temp;
	public void sort()
	{
	for(int i=0; i<arr.length;i++)
	{
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}	
	}
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]);	
}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bubblesort oo= new Bubblesort();
oo.sort();

	}
}
