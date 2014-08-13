package com.datastructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Stack
{
  private int top;
  private int size;
  private int stackarray[];
  Stack()
 { 
   size=10;
   top=-1;
   stackarray=new int[size];
 }
 Stack(int n)
 { 
   size=n;
   top=-1;
   stackarray=new int[size];
 }
 public int Peek()
 {
	 return stackarray[top];
 }
  public boolean isFull()
 {
   return (top==(size-1));
 }
  public boolean isEmpty()
 {
   return (top==-1);
 }
 public void Push(int element)
 {
   if(isFull())
  {
    System.out.println("Stack Full"); 
    return;
  }
    stackarray[++top]=element;	
 }
 public int Pop()
 {
   if(isEmpty())
  {
    System.out.println("stack empty");
    return -1; 
  }
  return stackarray[top--];
 }
 public void display()
 {
   for(int i=0;i<=top;i++)
     System.out.println(stackarray[i]);
 }
}