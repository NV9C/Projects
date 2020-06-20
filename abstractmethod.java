

import java.util.*;
import java.lang.*;
import java.io.*;

abstract class Demo
{ 
	int a=2,b=3;
	public void sum()
	{
		System.out.println(a+b);
		}
		abstract public void show();
}
class B extends Demo
{
	public void show()
	{
	
	  System.out.println("hi");
	  }
	public void sub()
	{
		System.out.println("hellllo");
		}
	
	
}
public class c
{
	public static void main(String []args)
	{
		B b=new B();
		b.show();
		b.sum();
		b.sub();
		}
	}
	
