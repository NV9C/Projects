

import java.util.*;
import java.lang.*;
import java.io.*;
class Demo
{
	public static void main (String[] args)
	{
		Scanner in=new Scanner(System.in);
		int a =in.nextInt();
		 int b =in.nextInt(); 
		 int n =in.nextInt(); 
		 int s=0;
		
		 s=s+a;
		   for(int i=0;i<n;i++)
		     {  
		     	s+=(Math.pow(2,i))*b;
		     
		       System.out.print("  "+s);
		      }

	}
}
