package Com.Rays.Java;

public class TestArray {

	public static void main(String[] args) {
		int[] a= {2,4,6,8,10};
		int[]ar= new int[5];
		for(int v:a) {
			System.out.println(v);
		}
		char[] b= {'a','b','c','d','e','f'};
		char[]c=new char[4];
		System.arraycopy(b, 2, c, 0, 4);
		System.out.println(new String(c));

	}

}
