package Com.Rays.String;

public class Name {

	public static void main(String[] args) {
String n="Vijay kumar";
System.out.println("String lenth :" + n.length());
System.out.println("5th character :" + n.charAt(5));
System.out.println("Index of kumar :" +n.indexOf("jay"));
System.out.println("1# position of a:"+n.indexOf("a"));
System.out.println("a is replaced by b :"+n.replace(" ", "b"));
System.out.println("Dad's name:"+n.substring(3));
System.out.println(n.replaceAll("[a-z]","#"));
System.out.println(n.toUpperCase());
System.out.println(n.toLowerCase());
System.out.println(n.startsWith("Vijay"));
System.out.println(n.endsWith("a"));

	}
}