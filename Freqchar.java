import java.util.*;
public class Freqchar{
    public static void freqcount(String str){
        int[]freq=new int[26];
        for(char c:str.toCharArray()){
           if (c >= 'a' && c <= 'z') {
           freq[c - 'a']++;
         }
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0){
               System.out.println((char)(i + 'a'));
            }
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        freqcount(str);
        sc.close();
    }
}