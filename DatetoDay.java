import java.util.*;
public class DatetoDay
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String dateofbirth=sc.next();
	    String[] dat=dateofbirth.split("/");
	    int date=Integer.parseInt(dat[0]);
	    int month=Integer.parseInt(dat[1]);
	    int year=Integer.parseInt(dat[2]);
	    int ls2dyear=year%100;
	    int mc[]={1,4,4,0,2,5,0,3,6,1,4,6};
	    int yc=(year>=2000)?6:0;
	    String []days={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
	    int value=(date+mc[month-1]+yc+ls2dyear+(ls2dyear/4))%7;
	   // System.out.println(68%7);
	   // System.out.println(value);
	    System.out.print(days[value]);
		sc.close();
	}
}