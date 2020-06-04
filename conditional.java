

import java.util.*;
import java.lang.*;
import java.io.*;

class D
{
	public static void main(String []args)
	{
		
	  int n;
	  Scanner sc=new Scanner (System.in);
	  n=sc.nextInt();
	  if((n%2==0)&&(n>=2&&n<=5))
  	{
		  System.out.println("Not Weird");
		}
	
	  if((n%2==0)&&(n>=6&&n<=20))
	  {
		  System.out.println(" Weird");
		}
	  if((n%2==0)&&(n>20))
	 {
		 System.out.println("Not Weird");
		}
  	if(n%2!=0)
 	{
	 	System.out.println("Weird");
		}
	}
}
  	
