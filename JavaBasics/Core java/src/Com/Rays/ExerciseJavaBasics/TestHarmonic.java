package Com.Rays.ExerciseJavaBasics;

public class TestHarmonic {

	public static void main(String[] args) {
	int i=5;
	double d=0.0;
	System.out.println("The harmonic series");
	while (i>0)
	{
	     d=d + (double)1/i;
		i--;
	
		System.out.println(d + ",");
	}

	}

}
