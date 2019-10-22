	package InheritanceDemo;

public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B obj=new B();
obj.demo(10);
	}
}
class A
{
public void demo(double i)//Override
{
System.out.println(i*2);	
}
}
class B extends A
{
public void demo(double i)//Override
{
System.out.println(i);	
}
public void demo(int a)//Overload
{
System.out.println(a);	
}
}
