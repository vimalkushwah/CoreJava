package Com.Rays.Java;

public class Copyarray {

	public static void main(String[] args) {
		char[]copyFrom= {'s','u','n','r','a','y','s'};
		char[]copyTo= new char[4];
		System.arraycopy(copyFrom, 3, copyTo, 0, 4);
		System.out.println(new String(copyTo));

	}

}
