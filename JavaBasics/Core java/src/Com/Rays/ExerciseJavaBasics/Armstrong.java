package Com.Rays.ExerciseJavaBasics;

public class Armstrong {
	public static void main(String[] args) {
		int n=153 ;
		int l=n; int r=0;
		for(int i=0; n!=0;i++) {
			int d=n%10;
			r+=d*d*d;
			n/=10;
			
		}if(r==l) {
			System.out.println("Given is Armstrong");
		}else {
			System.out.println("Not arm");
		}
	
	}

}
