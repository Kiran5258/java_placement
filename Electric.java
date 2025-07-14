import java.util.*;
class Electric{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double amount=1;
        if(n<=50){
            amount=n*3.50;
        }
        else if(n>50 && n<=150){
            amount=(n-50)*4.50+50*3.50;
        }
        else if(n>150 && n<=250){
            amount=(n-150)*4.50+100*5.20+50*3.50;
        }
        else{
            amount=(n-250)*6.75+100*4.50+100*5.20+50*3.50;
        }
        amount=amount+amount*0.2;
        System.out.println(amount);
        sc.close();
    }
}