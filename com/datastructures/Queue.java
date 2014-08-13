package com.datastructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Queue
{
  private int size,front,rear;
  private int q[];  
  Queue()
  {
    size=10;
    front=rear=-1;
    q=new int[size];
  }
  Queue(int n)
  {
    size=n;
    front=rear=-1;
    q=new int[size];
  }
  public boolean isEmpty()
  {
    return (front==rear);
  }
  public boolean isFull()
  {
     return (rear==(size-1));  
  }
  public void Enqueue(int element)
  {
     if(isFull())
     {
       System.out.println("Queue empty");
       return;
     } 
     q[++rear]=element;  
  }
  public int Dequeue()
  {
    if(isEmpty())
    {
       System.out.println("Queue Full");
       return -1;
    }
    return q[++front];
  }
  public void display()
  {
    for(int i=front; i<=rear;i++)
     System.out.println(q[i]);
  }

}