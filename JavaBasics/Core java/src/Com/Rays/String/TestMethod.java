package Com.Rays.String;

public class TestMethod {
	/*public void add() {
		System.out.println(5+6);
	}
		public static void main(String[] args) {
		System.out.println(args[0]+args[1]);
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=a+b;
		int d=a/b;
		System.out.println(d+"="+c);
		

TestMethod t= new TestMethod();
t.add();

}*/
		/*public int add() {
			return 5+6;
		}
		public static void main(String[] args) {
			TestMethod t= new TestMethod();
			int c= t.add();
			System.out.println(c);
			
		}*/
	public static int add(int a,int b) {
	return a+b;
	}
	public static void main(String[] args) {
		//TestMethod t= new TestMethod();
		int c=TestMethod.add(10, 20);
		System.out.println(c);
	}
	
		}

