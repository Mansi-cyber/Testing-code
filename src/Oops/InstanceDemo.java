package Oops;

public class InstanceDemo {
int num1,num2;
static int num3;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		num3=100;  // Static Variable
		InstanceDemo.num3=100;
		InstanceDemo oo=new InstanceDemo();
		oo.num1=10;//instance Variable
	}

}
