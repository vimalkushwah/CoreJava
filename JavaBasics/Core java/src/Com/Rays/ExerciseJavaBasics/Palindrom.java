package Com.Rays.ExerciseJavaBasics;

public class Palindrom {

	public static void main(String[] args) {
		int n=4536;
	   int r=0;
		for(int i=0; n>0; i++) {
			int d=n%10;
			r=d+(r*10);
			n/=10;
		}System.out.println("Palindron no is> "+ r);

	}

}
