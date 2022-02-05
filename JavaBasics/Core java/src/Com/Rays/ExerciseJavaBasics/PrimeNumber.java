package Com.Rays.ExerciseJavaBasics;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=13;int t=0;
		for(int i=2; i<=n/2; ++i) {
			if (n%i==0) {
				
				 t=1; break; 
				
			}
		}if(t==0) {System.out.println("prim no");
			
		}else {System.out.println("not prim");}
	}

}
