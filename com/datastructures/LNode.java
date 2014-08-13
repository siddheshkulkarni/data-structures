package com.datastructures;

class LNode
{
	int data;
	LNode next;
	LNode()
	{
		data=0;
		next=null;
	}
	public int getData()
	{
		return data;
	}
	public LNode getNode()
	{
		return next;
	}
	public void setData(int data)
	{
		this.data=data;
	}
	public void setNext(LNode next)
	{
		this.next=next;
	}
}
