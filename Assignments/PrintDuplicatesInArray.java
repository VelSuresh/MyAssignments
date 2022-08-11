package week1.day2.Assignments;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args)
	
	{
		
		//Declaring an array
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};

		//Sorting of arrays
		Arrays.sort(arr);
		
		//Finding Length of an arary
		int length=arr.length;
		
		
		//Outer For loop
		for (int i=0;i<length;i++)
		{
			//Inner For Loop
			for (int j= i+1;j<length;j++)
			{
				//Comparing two loop variables
				if(arr[i]==arr[j])
				{
					
					System.out.println("Duplicate elements are"+arr[i]);
				}
			}
			
			
			
			//System.out.println("Duplicate elements are"+arr[i]);
			
		}
	}}
		
		
	


