package week1.day2.Assignments;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) 
	
	{
		int num=5;
		
		int i=2 ;
		int count=0;
	      
	      
	      while(i<num)
	      {
	         if(num%i == 0)
	         {
	            count++;
	            break;
	         }
	         i++;
	      }
	      
	      if(count==0)
	         System.out.println("\n" +num+ " is a Prime Number.");
	      else
	         System.out.println("\n" +num+ " is not a Prime Number.");

	}

}
