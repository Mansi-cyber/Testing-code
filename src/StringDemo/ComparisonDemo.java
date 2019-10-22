package StringDemo;

public class ComparisonDemo {
String s1="Mansi";
String s2="Mansi";
String s3= new String("Mansi");

public void acc()
{
System.out.println(s1==s2);	// Shallow comparison(both saved in constant pool)
System.out.println(s1.equals(s2));//Deep comparison
System.out.println(s1==s3);
System.out.println(s1.equals(s3));

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparisonDemo oo= new ComparisonDemo();
		oo.acc();
	}

}
