package com.datastructures;

import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinarySearchAlgo {

	public static void main(String args[])
	{
		int size, search[],value,i=0,returnval;
		String input;
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array");
		input=br.readLine();
		if(input.length()==0)
			System.exit(0);
		size=Integer.parseInt(input);	
		if(size<0)
			System.exit(0);
		search=new int[size];
		for(;i<size;i++)
		{
			System.out.println("Enter elements of the array");
			search[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter value which you want to search in the array");
		value=Integer.parseInt(br.readLine());
		returnval=binarySearch(search,value);
	    if(returnval!=-1)
	    	System.out.println("The value is present at position "+returnval);
	    else System.out.println("Value not present");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static int binarySearch(int[] search,int value)
	{
		if(search.length==0)
			return -1;
		int first,last,mid,i;
		first=0;
		last=search.length;		
		while(first<=last)
		{
			mid=(first+last)/2;
			if(search[mid]==value)
			{
				return mid;
			}
			else if(search[mid]>value)
				last=mid-1;
			else first=mid+1;
		}
		return -1;
	}
}
