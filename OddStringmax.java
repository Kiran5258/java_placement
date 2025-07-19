import java.util.*;
public class OddStringmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String []str=new String[n];
        int []len=new int[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
            len[i]=str[i].length();
        }
        int max=0;boolean flag=false;int index=0;
        for(int i=0;i<n;i++){
            if(len[i]%2==1){
                flag=true;
                if(max<len[i]){
                    max=len[i];
                    index=i;
                }
            }
        }
        if(flag==true){
            System.out.println(str[index]);
        }
        else{
            System.out.println("Better luck next time");
        }
    }
}
