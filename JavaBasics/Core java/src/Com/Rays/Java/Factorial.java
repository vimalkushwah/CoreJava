package Com.Rays.Java;

public class Factorial {
	public static void main(String[] args)
	{
		int fact=1;
		int num=9;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			System.out.println("Factorial of number is :"+fact);	
		}
		
	}

}
