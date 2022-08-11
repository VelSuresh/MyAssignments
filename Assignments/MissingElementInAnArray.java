package week1.day2.Assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) 
	
	{
		
		//Declaring an Array
		int arr []= {1,2,3,4,7,6,8};
		
		//Sorting of an array
		Arrays.sort(arr);
		


		
		for (int i=arr[0];i<=arr.length-1;i++)
		{
			
			//Condition for finding missing element
			if(i != arr[i-1])
			{
				System.out.println("The missing element is "+i);
				
				break;
			}
		}
		
		

}
}