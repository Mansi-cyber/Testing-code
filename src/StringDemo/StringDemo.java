package StringDemo;

public class StringDemo
{
String name="Mansi";
String fname="Batra";
int a=5;
char c='y';
public void print()
{
System.out.println(name+a+c);
fname=name.concat(fname);
System.out.println(fname);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringDemo oo=new StringDemo();
oo.print();
	}

}
