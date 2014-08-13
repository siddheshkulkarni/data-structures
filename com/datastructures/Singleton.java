package com.datastructures;

import java.util.ArrayList;
import java.util.Iterator;

class Person
{
  String name;
  String address; 
  int ssn;  
  Person()
  {
	  setName(null);
	  setAddress(null);
	  setSsn(0);
  }
  @Override
  public String toString() {
  	return "Person [name=" + name + ", address=" + address + ", ssn=" + ssn
  			+ "]";
  }
  @Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ssn;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (ssn != other.ssn)
		return false;
	return true;
}
Person(String name,String address, int ssn)
  {
	  setName(name);
	  setAddress(address);
	  setSsn(ssn);
  }
  
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getSsn() {
	return ssn;
}
public void setSsn(int ssn) {
	this.ssn = ssn;
}  
}

 class SingletonClass {
    ArrayList<Person> person;
	private static SingletonClass instance=new SingletonClass();
	private SingletonClass()
	{
		person=new ArrayList<Person>();
	}
	public static SingletonClass getInstance()
	{
		return instance;
	}
	public void display()
	{
	 Iterator iterate=person.iterator();
	 while(iterate.hasNext())
		  System.out.println(iterate.next());
	}	
	public void Add(Person p)
	{
		person.add(p);
	}
}

public class Singleton
{
	public static void main(String[] args) 
	{
		System.out.println("person info");
		Person p=new Person("sidd","1116 w polk",1);
        SingletonClass instance=SingletonClass.getInstance();
        instance.Add(p);
        instance.Add(new Person("sarvesh","b-1",2));
        instance.display();
	}	
}
