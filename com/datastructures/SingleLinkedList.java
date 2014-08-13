package com.datastructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.datastructures.LNode;

public class SingleLinkedList {
	LNode head;
   SingleLinkedList()
   {
	   head=null;
   }
   public LNode getHead()
   {
	   return head;
   }
   public void setHead(LNode n)
   {
	   head=n;
   }
   public void addElement(int element)
   {
	 LNode temp=new LNode();
	 temp.setData(element);
	 temp.setNext(null);
	 if(head==null)
	 {
		 head=temp;
	 }
	 else
	 {
	   LNode traverse=head;
	   while(traverse.next!=null)
		   traverse=traverse.getNode();
	   traverse.setNext(temp);	    
	 }
   } //addElement
   public void deleteElement(int deleteelement)
   {
	   if(head==null)
		   return;
	   LNode temp=head,previous=head;
	   if(temp.getData()==deleteelement)
		   head=head.getNode();
	   else 
	   {
		   while(temp.getNode()!=null && temp.getData()!=deleteelement)
		   {
			   previous=temp;
			   temp=temp.getNode();
		   }
		   if(temp.getData()==deleteelement)
		   {
			   previous.setNext(temp.getNode());
		   }
		   else
			   System.out.println("Element to delete not found");
	   }	  
   } //deleteElement
   public void display()
   {
	   LNode temp=head;
	   while(temp!=null)
	   {
		   System.out.println(temp.getData());
		   temp=temp.getNode();
	   }
   }  //display   
   public boolean Loop()
   {
	   if(head==null)
		   return false;
	   LNode slow,fast;
	   slow=fast=head;
	   while(slow!=null && fast.getNode()!=null)
	   {
		   slow=slow.getNode();
		   if(fast.getNode()!=null)
		   fast=fast.getNode().getNode();
		   if(slow==fast)
			   return true;		   
	   }
	   return false;
   }
   public LNode Reverse(LNode head)
   {
	   if(head==null || head.next==null)
		   return head;
	   LNode remain=Reverse(head.next);
	   LNode current=remain;
	   while(current.getNode()!=null)
	   {
		   current=current.getNode();
	   }
	   current.setNext(head);
	   head.setNext(null);	   
	   return remain;
   }    
   
   public static void main(String args[])
   {
	   int element;
	   try
	   {
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   System.out.println("Enter element to add in linked list");
	   element=Integer.parseInt(br.readLine());
	   SingleLinkedList s=new SingleLinkedList();
	   s.addElement(element);
	   System.out.println("Enter element to add in linked list");
	   element=Integer.parseInt(br.readLine());
	   s.addElement(element);
	   
	   System.out.println("Enter element to add in linked list");
	   element=Integer.parseInt(br.readLine());
	   s.addElement(element);
	   System.out.println("Enter element to add in linked list");
	   element=Integer.parseInt(br.readLine());
	   s.addElement(element);
	   System.out.println("Enter element to add in linked list");
	   element=Integer.parseInt(br.readLine());
	   s.addElement(element);
	   s.display();
	   System.out.println("Enter the element to be deleted");
	   element=Integer.parseInt(br.readLine());
	   s.deleteElement(element);
	   s.display();	   	    
	   System.out.println("Loop present "+s.Loop());
	   s.setHead(s.Reverse(s.getHead()));
	   System.out.println("Reverse of linkedlist ");
	   s.display();
	   }
	   catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }	   
   }
   
}
