package com.datastructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayRotation {

	public static void main(String args[])
	{
		int search[],rotate,size;
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the size of array");
			size=Integer.parseInt(br.readLine());
			search=new int[size];
			for(int j=0; j<size;j++)
			{
				System.out.println("Enter The elements");
				search[j]=Integer.parseInt(br.readLine());
			}
			System.out.println("Enter no of times you want to rotate the array");
			rotate=Integer.parseInt(br.readLine());
			Rotate(search,0,rotate-1);
			Rotate(search,rotate,search.length-1);
		    Rotate(search,0,search.length-1);
			for(int j=0; j<size;j++)
			{
				System.out.print(search[j]);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public static void Rotate(int[] rotate, int start,int rotatetimes)
	{
		int temp;
		for(int i=start;i<=(start+rotatetimes)/2;i++)
		{
			temp=rotate[i];
			rotate[i]=rotate[start+rotatetimes-i];
			rotate[start+rotatetimes-i]=temp;
		}
	}
}
