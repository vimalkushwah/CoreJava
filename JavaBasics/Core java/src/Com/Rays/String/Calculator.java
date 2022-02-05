package Com.Rays.String;

public class Calculator {

	public static void main(String[] args) {
		int k;
		if(args[0].equals("sum")) {
			System.out.println("sum=");
			k=sum(8,5);
			System.out.println(k);
		}else if(args[0].equals("sub")) {
			System.out.println("substrect");
			k=sub(8,5);
			System.out.println(k);
		}else if(args[0].equals("mul")){
			System.out.println("multiple");
			k=mul(8,5);
			System.out.println(k);
		}else if(args[0].equals("div")){
			System.out.println("division");
			k=div(8,5);
			System.out.println(k);
		}
		
		}
			
	public static int sum(int i,int j) {
		return i+j;
	}
	public static int sub(int i,int j) {
		return i-j;
	}
	public static int mul(int i,int j) {
		return i*j;
	}
	public static int div(int i,int j) {
		return i/j;
	}
}