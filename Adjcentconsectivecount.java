import java.util.*;
public class Adjcentconsectivecount{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int [][]arr=new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println();
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();
    int count=0;
    int temp=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<m-1;j++){
            if(arr[i][j]%10==arr[i][j+1]%10 ){
                // System.out.println(arr[i][j]+" "+arr[i][j+1]);
                temp=arr[i][j+1];
                if(temp==arr[i][j])count+=1;
                else count+=2;
            }
        }
    }
    System.out.println(count);
    sc.close();
    }
}