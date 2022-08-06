package week1.day1;

public class ConvertANegativeNumberToPositiveNumber {

	
	public static void main(String[] args)
	
	
	{
		
		//Intialization of an integer with negative value
		int number=-80;
		
		if(number<0)
		{
			System.out.println("The number is a negative number");
			
			//Formula to convert Positive number to Negative
			number=number*(-1);
			
	System.out.println("The converted positive value of number is = "+number);
		}
		else 
		{
			System.out.println("The number is not  negative ");
			
		}

	}

}
