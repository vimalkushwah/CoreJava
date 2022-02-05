package Com.Rays.ExerciseJavaBasics;

public class Sumofinteger {

	public static void main(String[] args) {
		/*int f=0;
		System.out.println();
		System.out.println("between 100&200 div by 7");
		for (int e = 100; e <= 200; e++) {
		if  ( e %7==0) {
			System.out.println(e);
			f+=e;
		}
		
		}System.out.println("sum of all no=="+f);*/
	int a=100;
	int b=200;
	int j=0;
	for(int i = 100; i < 200; i++) {
		if (i%7==0) {
			System.out.println(i);
			j+=i;
		}
	}System.out.println("Sum of all no ="+j);
	
	
	}

}
