package StaticDemo;

public class StaticBlockDemo {
static int a=100;
static
{
System.out.println(a);	
}

public void acc()
{
	System.out.println("Acc");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticBlockDemo oo=new StaticBlockDemo();
oo.acc();

	}

}
