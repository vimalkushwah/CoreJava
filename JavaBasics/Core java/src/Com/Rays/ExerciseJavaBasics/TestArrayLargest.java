package Com.Rays.ExerciseJavaBasics;

public class TestArrayLargest {
	public static void main(String[] args) {
		int []a= {1,2,4,6,8,5};
        int b=a[0];
		for(int i:a) {
			if(i>b) {
				b=i;
			}
		}System.out.println("greter value is -"+b);
	}

}
