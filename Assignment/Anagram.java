import java.util.*;
public class Anagram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        System.out.println(Anagramchecker(str1,str2));
    }
    public static boolean Anagramchecker(String str1,String str2){
        if(str1.length()!=str2.length())return false;
        char[] char1 = str1.toCharArray();
        char[] char2=str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        for(int i=0;i<str1.length();i++){
            if(char1[i]==char2[i]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}