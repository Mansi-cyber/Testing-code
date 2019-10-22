package MethodDemo;

public class TakeReturnDemo {

	//Taking Something Returning Something

//	int sum;
//	public int add(int num1,int num2)
//	{
//		sum=num1+num2;
//		return sum;
//		
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		TakeReturnDemo oo=new TakeReturnDemo();
//		System.out.println(oo.add(10, 20));
//	}
//
//}
	
	
	//Taking Something Returning Nothing
	int sum;
public void add(int num1,int num2)
{
	sum=num1+num2;
	System.out.println("Sum is : "+sum);
	
}

	//Taking Nothing Returning Something
	
	public int add1()
	{
		return sum;
	}


public static void main(String[] args) {
	TakeReturnDemo oo= new TakeReturnDemo();
	oo.add(10,20);
	System.out.println(oo.add1());
}

}