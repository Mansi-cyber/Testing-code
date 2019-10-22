package ConstructorDemo;

public class Demo {
int num1,num2,sum;

public Demo()
{
	num1=10;
	num2=20;
sum=num1+num2;
System.out.println(sum);
}

public void add1()
{
System.out.println("Num1 is : "+num1);	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo oo=new Demo();
oo.add1();
	}

}
