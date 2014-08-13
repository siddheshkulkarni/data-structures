package com.datastructures;

import com.datastructures.Node;

public class BinarySearch {
  Node head;
  BinarySearch()
  {
	  head=null;
  }
  public void Add(int element)
  {
	  Node temp=new Node();
	  temp.setData(element);
	  temp.setLeft(null);
	  temp.setRight(null);
	  if(head==null)
	  {
		  head=temp;
	  }
	  else
	  {
		  Node traverse=head,previous=head;
		  while(traverse!=null)
		  {
			  if(traverse.getData()>=element)
			  {
				  previous=traverse;
				  traverse=traverse.getLeft();
			  }
			  else 
			  {
				  previous=traverse;
				  traverse=traverse.getRight();
			  }			  
		  }
		  if(previous.getData()>=element)
			   previous.setLeft(temp);
		  else	 previous.setRight(temp);
	   }	  
	  
  } // Add
  public void Delete(int element)
  {
	 Node traverse=head, previous=head;
	 if(traverse==null)
	 {
		 return;
	 }
		if(traverse.getData()==element)
		{
			return;
		}
			
		if(traverse.getLeft().getData()>=element)
		{
			previous=traverse;
			traverse=traverse.getLeft();
			return;
		}
		if(traverse.getRight().getData()<=element)
		{
			previous=traverse;
			traverse=traverse.getRight();
		}				
			
	  // main if	 
	  
  } // Delete
}
