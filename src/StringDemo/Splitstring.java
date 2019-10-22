package StringDemo;

public class Splitstring {
	String str="mansi batra";
	String st[];
	public void acc()
	{
		System.out.println("SPlitting string");
		st=str.split(" ");
		System.out.println(st[1]);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainDemo oo= new ContainDemo();
		oo.acc();
	}

}
