

import java.util.*;
import java.lang.*;
import java.io.*;
class Demo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String a=new String("Computer");
		String d=new String("computer");
		int b=a.lastIndexOf("Co",3);
		int c=a.indexOf("m");
		System.out.println(b+" " +c);
		if(a.equals(d))
		{
			System.out.println("same");
			}
		else
		{
			System.out.println("not samee");
			}
		
	  if(a.equalsIgnoreCase(d))
		{
			System.out.println("same");
			}
		else
		{
			System.out.println("not samee");
			}
		String x=a.substring(3,5);
		System.out.println(x);
		System.out.println(a.compareTo(d));
		
	}
}
