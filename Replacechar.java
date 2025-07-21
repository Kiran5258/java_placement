import java.util.*;
class Replacechar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s.replace('A', 'B').replace('a', '@').replace('1', 
        '2'));
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'){
                str.setCharAt(i, 'B');
            }
            else if(str.charAt(i)=='a')
            str.setCharAt(i,'@');
            else if(str.charAt(i)=='1')
            str.setCharAt(i,'2');
        }
        System.out.println(str.toString());

        // String s1="";
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='A'){
        //         s1+='B';
        //     }
        //     else if(s.charAt(i)=='a'){
        //         s1+='@';
        //     }
        //     else if(s.charAt(i)=='1')
        //     s1+='2';
        //     else
        //     s1=s1+s.charAt(i);
        // }

        sc.close();
    }
}