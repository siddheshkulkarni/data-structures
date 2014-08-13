package com.datastructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String args[])
	{
	  String input;	 
	  boolean check;
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter The word which you want to find out if palindrome or not");
			input=br.readLine();
			check=isPalindrome(input);
			if(check)
				System.out.println("Word is palindrome");
			else System.out.println(" word is not a Palindrome");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		 
	}
	public static boolean isPalindrome(String input)
	{
		if(input==null|| input.length()==0)
			return false;
		if(input.contains(" "))
			return false;
		int size=input.length();		
		char inputarray[]=input.toCharArray();
		
		for(int i=0; i<=size/2;i++)
			if(inputarray[i]!=inputarray[size-1-i])
				return false;			
		
		return true;
	}
}
