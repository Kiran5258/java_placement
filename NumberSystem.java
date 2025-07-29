/* Problems on Number System
   Convert Decimal to Binary
   Convert decimal to octal
   Convert octal to decimal
   Convert Decimal to hexa decimal
   Convert hexa decimal to decimal 
 */
import java.util.*;
class NumberSystem{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        BinarytoDecimal(number);
    }
    static void BinarytoDecimal(int num){
        int power=0,sum=0,digit=0;
        while(num!=0){
            digit=num%10;
            if(digit==1)sum+=Math.pow(2,power++);
            else
            power++;
            num/=10;
        }
        System.out.println(sum);
    }
}