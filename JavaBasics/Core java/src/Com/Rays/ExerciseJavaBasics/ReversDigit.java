package Com.Rays.ExerciseJavaBasics;

public class ReversDigit {

	public static void main(String[] args) {
		int n=4563;
		int a=0;
		for(int i=0; n>0; i++) {
			int d=n%10;
			a=(a*10)+d;
			n/=10;
		}System.out.println("revers digit is ="+ a);

	}

}
