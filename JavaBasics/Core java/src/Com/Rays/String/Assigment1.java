package Com.Rays.String;

public class Assigment1 {

	public static void main(String[] args) {
	String s=" Vijay Kumar Sinha ";
		//System.out.println(s.trim());
	System.out.println(s.length());
    for(int i=s.length();i>=1;i--) {
    	System.out.print(s.charAt(i-1));
    }
	
		String[]st=s.split(" ");
		for (String sb:st) {
		System.out.println(sb);
		}
		
	    
		for(String s1:st) {
			for(int i=s1.length();i>=1;i--) {
				System.out.print(s1.charAt(i-1));
			}
			
		}int p=0;
		System.out.println("count V=");
		for(int i=s.length();i>=1;i--) {
			if(s.charAt(i-1)=='V' ) {
				p++;
				
				}
				
			}System.out.print(p);
			System.out.println();
			p=0;
			System.out.println("tc");
			for(int i=0;i<s.length()-1;i++) {
				for (int j=0;j<s.length()-1;j++) {
					if(s.charAt(i)==s.charAt(j)) {
						p++;
					}
				}System.out.println(s.charAt(i)+"="+p);p=0;
    }
			/*String s1= "Ram";
			String s2= "Shyam";
			String name=s1+s2;
			name=s1.concat(s2);
			System.out.println(name);*/
			String s1="Ram prasad";
			String s2=s1;
			System.out.println(s2);
			
			
		}
	
        }
	

