/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Demo
{
	public static void main (String[] args)
	{
		int bal=400;
		int wit=500;
		try
		{
		if(bal<wit)
		{
			throw new ArithmeticException("Insufficient");
			}
		else
		{
			System.out.println("Transaction success");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			}
		
	}
}
