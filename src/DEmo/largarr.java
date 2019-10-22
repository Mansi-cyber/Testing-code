package DEmo;

public class largarr
{
int arr[]={0,5,8,7,3};
public void lar()
{
for(int i=0;i<arr.length;i++)
	if(arr[i]>arr[i+1])
	{
		System.out.print("arr[i] is largest");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
largarr oo= new largarr();
oo.lar();
	}
}
