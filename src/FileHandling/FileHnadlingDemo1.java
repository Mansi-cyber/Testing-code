package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHnadlingDemo1 {
byte[] arr={12,3,4,5,6};
	public void acc() throws IOException
	{
		File f=new File("D://Students.txt"); // Used to create the file at the desired location
		f.createNewFile();
	
	FileOutputStream fo=new FileOutputStream(f); // For writing data into the file
	for(int i=0;i<arr.length;i++)
	{
		fo.write(arr[i]);
	}
	
	FileInputStream is=new FileInputStream(f); // Reading the data from the file
	int size=is.available();
	System.out.println("Size is :"+size);
	for(int i=0; i<size;i++)
	{
		System.out.println(is.read());
	}
	}
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileHnadlingDemo1 oo=new FileHnadlingDemo1();
		oo.acc();
	}

}
