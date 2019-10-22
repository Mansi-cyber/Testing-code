package DEmo;

import java.util.Scanner;

public class reportcard
{
int[] rollno= new int[2];
String[] name=new String[2];
double[] Eng=new double[2];
double[] Hindi=new double[2];
double[] Total=new double[2];
float[] Average=new float[2];
int counter;
Scanner s=new Scanner(System.in);

public void student1()
{
//System.out.println("Enter Name");

for(counter=0; counter<2;counter++)
{
            //for printing data for 1 student
System.out.println("Enter rollno of "+counter+" Student");
rollno[counter]=s.nextInt();
System.out.println("Enter name of "+counter+"Student");
name[counter]=s.next();
System.out.println("Enter marks of English for "+counter+"Student");
Eng[counter]=s.nextDouble();
System.out.println("Enter marks of Hindi for "+counter+"Student");
Hindi[counter]=s.nextDouble();
}
System.out.print("Roll No\tName\tEngAmrks\tHindiMarks\tTotal Marks\tAverage\n");
for(int n=0;n<2;n++)
{

System.out.print(rollno[n]+"\t");
System.out.print(name[n]+"\t");
System.out.print(Eng[n]+"\t\t");
System.out.print(Hindi[n]+"\t\t");
System.out.print(Hindi[n]+Eng[n]+"\t\t");
System.out.print((Hindi[n]+Eng[n])/2+"");
System.out.println();
}

}

public static void main(String[] args) {
// TODO Auto-generated method stub
reportcard oo=new reportcard();
oo.student1();
}

}

