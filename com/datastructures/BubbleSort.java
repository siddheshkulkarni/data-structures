package com.datastructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BubbleSort 
{

	public static void main(String[] args) 
	{
		int bubble[], size;
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the size of the array");
			size=Integer.parseInt(br.readLine());
			bubble=new int[size];
			for(int k=0; k<size;k++)
				bubble[k]=Integer.parseInt(br.readLine());
			bubbleSort(bubble,size);
			for(int i=0;i<size;i++)
				System.out.println(bubble[i]);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public static void bubbleSort(int[] bubble, int size)
	{
		int temp;
		for(int i=size-1;i>-1;i--)
			for(int j=0;j<i;j++)
			{
				if(bubble[j]>bubble[j+1])
				{
				  temp=bubble[j];
				  bubble[j]=bubble[j+1];
				  bubble[j+1]=temp;
				}
			}
	}

}
