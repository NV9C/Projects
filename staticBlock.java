

import java.util.*;
import java.lang.*;
import java.io.*;
class Demo
{
	static Boolean f=true;
	static int h,b;
	
	static
	{
		Scanner sc=new Scanner (System.in);
		h=sc.nextInt();
		b=sc.nextInt();
		if(b>0&&h>0)
		{
			f=true;
			System.out.println(b*h);
			}
		else
		{
			f=false;
			System.out.println("java.lang.Exception: Breadth and      height must be positive");
			 }
			 }
	public static void main (String[] args)
	{
		
	}
}
