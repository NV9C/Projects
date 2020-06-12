/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Demo extends Thread
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++);
		{
			System.out.println("Demo:"+i);
			}
		}
}
class D extends Thread
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++);
		{
			System.out.println("D is :"+i);
			}
		}
}
class B
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Demo t1=new Demo();
		D t2=new D();
		t1.start();
		t2.start();
		
	}
}
