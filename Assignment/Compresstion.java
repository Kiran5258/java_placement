import java.util.*;
public class Compresstion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int left=0;
        int right=1;
        int count=1;
        while(right<str.length()){
            if(str.charAt(left)==str.charAt(right)){
                count++;
                right++;
            }
            else if(str.charAt(left)!=str.charAt(right)){
                System.out.print(str.charAt(left)+""+count);
                count=0;
                left=right;
            }
        }
        System.out.println(str.charAt(left)+""+(count));
    }
}