package week1.day2.Assignments;

public class Fibbinocci {

	
	public static void main(int[] args) {
		
	}
	
	
	public static void main(String[] args) 
	
	{
		int firstNum=0;
		
		int SecNum=1;
			
		System.out.println(firstNum);
		System.out.println(SecNum);
		for(int i=0;i<11;i++)
		{
			
			
		int sum=(firstNum+SecNum);
			
			firstNum=SecNum;
			
			SecNum=sum;
			
			System.out.println(sum);
			
			
		}

	}

}
