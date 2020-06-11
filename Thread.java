/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Demo implements Runnable
{
	public void run()
	{
		int i;
		for(i=0;i<=10;i++);
		{
			System.out.println("Demo is :"+i);
			}
		}
}
class D implements Runnable
{
	public void run()
	{
		int i;
		for(i=0;i<=10;i++);
		{
			System.out.println("D is :"+i);
			}
		}
}
class B
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Thread t1=new Thread(new Demo());
		Thread t2=new Thread(new D());
		t1.start();
		t2.start();
		
	}
}
