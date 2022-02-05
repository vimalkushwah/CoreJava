

package Com.Rays.Java;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class date {

	private static final int Date = 0;

	public static void main(String[] args) throws ParseException {
		Date d=new Date();
		System.out.println(d);
		System.out.println("Date :"+ d);
		System.out.println(d.getDate());		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String s= sdf.format(d);
		System.out.println(s);
		
		String s1="22/01/2022";
		Date d1=sdf.parse(s1);
		System.out.println(d1);
		System.out.println(d.getDay());
		System.out.println(d.getTime());
		System.out.println(Calendar.getInstance());
		//System.out.println();
	    Calendar c=Calendar.getInstance();
	    System.out.println("start date is -"+d1); 
	    System.out.println("End date is -"+d);
	    if(d.after(d1)) {
	    	System.out.println("start date is greter");
	    }
	    for(int i=0;i<12;i++) {
	   c.add(Calendar.DATE, 30);
	   Date n=c.getTime();
	   System.out.println(n);
	  
	    }
	    String s2="28/08/1994";
	    Date d2=sdf.parse(s2);
	    c.setTime(d2);
	    int year1=c.get(Calendar.YEAR);
	    int month1=c.get(Calendar.MONTH);
	    int day1=c.get(Calendar.DAY_OF_MONTH);
	    c.setTime(d);
	    int year2=c.get(Calendar.YEAR);
	    int month2=c.get(Calendar.MONTH);
	    int day2=c.get(Calendar.DAY_OF_MONTH);
	   System.out.println("year -"+(year2-year1));
	   System.out.println("month -"+(month2-month1));
	   System.out.println("day -"+(day2-day1));
	    
	    
	}

}
