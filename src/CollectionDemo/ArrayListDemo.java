package CollectionDemo;

import java.util.ArrayList;

import java.util.Iterator;
public class ArrayListDemo {
public void accept()
{
ArrayList al=new ArrayList(); // Non-generic arraylist
al.add(1);
al.add("Mansi");
al.add(4);
al.add("Manav");
System.out.println(al.get(3));
System.out.println(al);
System.out.println(al.remove(0));
System.out.println(al);
System.out.println("------------------");
Iterator it=al.iterator(); // Using Iterator
while(it.hasNext())
{
System.out.println(it.next());	
}

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayListDemo oo= new ArrayListDemo();
oo.accept();
	}

}
