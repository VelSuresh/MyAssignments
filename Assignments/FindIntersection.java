package week1.day2.Assignments;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) 
	
	{
		//Decclartion of array1
		
		int a[]={3,2,11,4,6,7};
		
		Arrays.sort(a);
		
		
		//Declarion of array2
		int[] b={1,2,8,4,9,7};
		
		Arrays.sort(b);
		//For Loop
		for(int i=0;i<a.length;i++)
		{
			//Nested For loop
			for (int j=0;j<b.length;j++)
			{
				//Condition to check common number in both the arrays
				if (a[i]==b[j])
				{
					System.out.println("common element  present in both arrays is "+a[i]);
				}
							
			}
		}

	}

}
