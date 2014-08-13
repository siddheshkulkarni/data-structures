package com.datastructures;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.datastructures.Palindrome;
public class ReversePalindrome {
 
	public static void main(String args[])
	{
		String input;
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter word");
			input=br.readLine();
			boolean check;
			check=reversePalindrome(input);
			if(check)
				System.out.println("Palindrome");
			else System.out.println("Not Palindrome");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public static boolean reversePalindrome(String input)
	{
		if(input==null || input.length() ==0)
		 return false;
		int size=input.length();
		String last,first;
		for(int i=0; i<size;i++)
		{
			first=input.substring(i);
			last=input.substring(0,i);
			if(Palindrome.isPalindrome(first+last))
				return true;
		}
		return false;
	}
}
