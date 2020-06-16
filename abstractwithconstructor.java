

import java.util.*;
import java.lang.*;
import java.io.*;
abstract class A
{
	public A(int a)
	{
		System.out.println("a is:"+a);
		}
	
}
class B extends A
{
	public B()
	{
		this(4);
		System.out.println("hi child");
		}
	public B(int a)
	{
		super(3);
		System.out.println("a :"+a);
		}
	
	
}
public class c
{
	public static void main(String[] args)
	{
		B a=new B();
		}
}


