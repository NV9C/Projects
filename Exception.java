/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Demo
{
	public static void main (String[] args) 
	{
		int x=3;int y=0;int z;
		try
		{
			z=x/y;
		 System.out.println(z);
		 System.out.println("hello");
		 }
		 catch(ArithmeticException e)
		 {
		 	System.out.println(e.getMessage());
		 	}
		 finally
		 {
		 	System.out.println("helloa");
		 	}
	}
}
