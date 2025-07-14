import java.util.*;
public class Subseqsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=arr[0];
        int maxend=arr[0];
        int start=0,end=0,tempstart=0;
        for(int i=1;i<n;i++){
            if(maxend+arr[i]<arr[i]){
                maxend=arr[i];
                tempstart=i;
            }
            else{
                maxend=maxend+arr[i];
            }
            if(maxend>res){
                res=maxend;
                start=tempstart;
                end=i;
            }
        }

        System.out.println(res);
        for(int i=start;i<end;i++)
        System.out.print(arr[i]+" ");
        sc.close();
    }
}
