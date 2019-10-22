package CollectionDemo;

import java.util.*;

public class Iterator {
	 public void add()
	 {
		 ArrayList<String> list = new ArrayList<String>(); // Generic Arraylist
		  
	        list.add("A"); 
	        list.add("B"); 
	        list.add("C"); 
	        list.add("D"); 
	        list.add("E"); 
	        
	        for(int i=0;i<list.size();i++)
	        {
	        	System.out.println(list.get(i));
	        }
	        
//	        for(Object e:list)
//	        {
//	        	System.out.println(e);
//	        }
	 }
	 public static void main(String arg[])
	 {
		 Iterator oo=new Iterator();
		 oo.add();
	 }
	 }