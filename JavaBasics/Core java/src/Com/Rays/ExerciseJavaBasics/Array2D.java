package Com.Rays.ExerciseJavaBasics;

public class Array2D {

	public static void main(String[] args) {
/*int[][]j=new int[5][5];
for(int a=0;a<j.length;a++) {
System.out.println();
for(int k=0;k<j[a].length;k++) {
	System.out.print(k);
}
}*/
		/*int[][]j=new int[10][9];System.out.println();
		for(int i=0;i<j.length;i++) {
			System.out.println();
			for(int k=0;k<j[i].length;k++) {
		     j[i] [k]=(i+1)*(k+2);
				System.out.print(j[i] [k]+"\t");
				
			}
		}

	}*/



		int[]i= {1,2,3,4,5,7,6,9,8};
	//int[]j=new int [5];

	//System.out.println(i.length);
//for(int a:i) {
	//if(a>k) {
	//	k=a;
		
//	}
//}System.out.println(k);
		greter(i);
	}
	
	public static void greter(int [] g) {
	int x=g[0];int f=0;
	for(int i=0;i<g.length;i++) {
		if (g[i]>x){
			f=x;
			x=g[i];
			
			
	}
	}
	System.out.println("greter value by for is =="+x);
	System.out.println("second greter value =="+f);
	
	int[]a= {1,2,3,4,5,6};
	int[]b= {1,2,4,5,6};
	int k=0; int l=0;
    for (int i:a) {
    	 k+=i;
    }
    for (int j:b) {
    	l+=j;
    }int m=k-l;System.out.println("missing value of B is"+ m);
	
	
	
	//System.out.println();
	//int []c= {1,2,3,4,5,6,7};
	//int []d= new int [5];
	//for (int f:c) {System.out.println(c);
	
	
	//}
	}	
}
