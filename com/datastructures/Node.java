package com.datastructures;

public class Node {
  private int data;
  private Node left;
  private Node right;
  Node()
  {
	  data=-1;
	  left=right=null;
  }
  public Node getLeft()
  {
	  return left;
  }
  public Node getRight()
  {
	  return right;
  }
  public int getData()
  {
	  return data;
  }
  public void setLeft(Node l)
  {
	  left=l;
  }
  public void setRight(Node r)
  {
	  right=r;
  }
  public void setData(int d)
  {
	  data=d;
  }
}
