package Com.Rays.String;

public class Buffer {

	public static void main(String[] args) {
StringBuffer sb=new StringBuffer("This is java");
sb.append(",Java is OOP");
sb.append(",Java is promising language for job");
System.out.println(sb);
System.out.println("legth:"+sb.length());
//System.out.println("Reverse:"+sb.reverse());
System.out.println(sb.capacity());
System.out.println(sb.charAt(58));
System.out.println(sb.replace(5, 10, "1"));
System.out.println();
	}

}
