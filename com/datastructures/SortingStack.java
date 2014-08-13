package com.datastructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SortingStack {

public void sort(Stack s)
{
	if(s.isEmpty())
  	return;
	int element=s.Pop();
	sort(s);
    insert(s,element);
}
public void insert(Stack s, int x)
{
	int temp;
   	if(!s.isEmpty() && s.Peek() > x)
   	{
   		temp=s.Pop();
   		insert(s,x);
   		s.Push(temp);
   	}
   	else
   	{
   		s.Push(x);
   	}
}
	public static void main(String[] args) 
	{
		int size;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
	  System.out.println("Enter the size of stack");
	  size=Integer.parseInt(br.readLine());
	  Stack s =new Stack(size);
	  for(int i=0; i<size;i++)
	  {
	  System.out.println("Enter element");
	    s.Push(Integer.parseInt(br.readLine()));
	  }
	  s.display();
	  System.out.println("Sorted stack");
	  SortingStack st=new SortingStack();
	  st.sort(s);
	  s.display();
		}
		catch(Exception ex)
		{}
 
	}

}
