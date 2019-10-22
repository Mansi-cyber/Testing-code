package DEmo;

import java.util.Scanner;

public class Addtwood {

		int[][] mat1=new int[3][3];
		int[][] mat2=new int[3][3];
		int[][] mat3=new int[3][3];
		Scanner ac=new Scanner(System.in);
		public void accept()
		{
		System.out.println("Enter elements for matrix 1 :");
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
		{
		mat1[i][j]=ac.nextInt();
		}
		}
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
		{
		System.out.print("\t"+mat1[i][j]);
		}
		System.out.println();
		}

		System.out.println("Enter elements for matrix 2 :");
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
		{
		mat2[i][j]=ac.nextInt();
		}
		}
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
		{
		System.out.print("\t"+mat2[i][j]);
		}
		System.out.println();
		}
		System.out.println("Addition of matrix is :");
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
		{

		mat3[i][j]=mat1[i][j]+mat2[i][j];
		System.out.print("\t"+mat3[i][j]);
		}
		System.out.println();
		}
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addtwood oo=new Addtwood();
		oo.accept();
		}

		}
