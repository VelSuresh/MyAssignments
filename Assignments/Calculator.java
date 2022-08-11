package week1.day2.Assignments;

public  class Calculator {

//Method for Addition of 3 numbers
	public int add(int num1,int num2,int num3)
	{
	int sum=(num1+num2+num3);
	System.out.println("Addition of three numbers is "+sum);

	return sum;
	}
	//Method for subtraction of 2 numbers
	public int sub(int num1, int num2)
	{
		int subtraction =(num1 -num2);
		
		System.out.println("Subtraction of 2 numbers is "+subtraction);
		return subtraction;
	}
	
	//Method for Multiplication of 2 numbers
	
	public  double mul(double num1 , double num2)
	{
		double multiply=(num1*num2);
	
		System.out.println("Multiplication of 2 numbers is " +multiply);
		
		return multiply;
		
	}
	
	//Method for addition of 2 numbers
		public float divide(float num1, float num2)
		{
			float divison=(num1/num2);
			
			System.out.println("Divison of 2 numbers is " +divison);
			
			return divison;
			
			
		}
	
	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

	}

}
