import java.util.*;
public class Vaildation{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String email=sc.next();
        if(!email.contains("@")){
            System.out.println("Invalid email address");
            return;
        }
        int index = email.indexOf('@');
        boolean flag=false;
        if(index!=-1 && index<email.length()-1){
            if(email.substring(index+1).equals("gmail.com") || email.substring(index+1).equals("gmail.org")|| email.substring(index+1).equals("gmail.in"))
            flag=true;
        }
        if (flag) {
            System.out.println("Validation");
        } else {
            System.out.println("Invalid");
        }

    }
}