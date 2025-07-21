import java.util.*;
public class Passwordchecker {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String password=sc.nextLine();
        if(password.length()<6){
            System.out.println("Password is less than 6");
            return;
        }
        int uc=0,lc=0,num=0,spl=0;
        for(int i=0;i<password.length();i++){
            if(password.charAt(i)>=6){
                if(password.charAt(i)==')'&& password.charAt(i)=='('){
                    System.out.println("Invalid");
                    return;
                }
                else if(password.charAt(i)>='A'&& password.charAt(i)<='Z'){
                    uc++;
                }
                else if(password.charAt(i)>='a'&& password.charAt(i)<='z')
                    lc++;
                else if(password.charAt(i)>='0'&& password.charAt(i)<='9')
                    num++;
                else
                spl++;
            }
        }
        if(lc>0 && uc>0 && spl>0 && num>0)System.out.println("Valid password");
        sc.close();
    }
}
