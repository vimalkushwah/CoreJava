package Com.Rays.ExerciseJavaBasics;

public class AverageOfEvenOddNumber {
	public static void main(String[] args) {
		int e=0,n=10,k=0,l=0;
		int o=0;
		for(int i=0; i<=n; i++) {
			if(i%2==0) {
			++e;
			k+=i;
			 
			System.out.println("even no is -"+i);
			}else {
				++o;
				l+=i;
				System.out.println("odd no is -"+i);
			}
			
		}
		System.out.println("sum of even -"+k+" Average of even -"+k/e);
		System.out.println("sum of odd -" +l+ "average of odd -"+l/o);
		
		}

}
