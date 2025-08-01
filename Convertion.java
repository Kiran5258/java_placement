import java.util.*;
public class Convertion
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	String s="";
	for(int ch:a.toCharArray()){
	    int c=(int)ch^32;
	    s+=(char)c;
	}
	System.out.println(s);
    sc.close();
	}
}
