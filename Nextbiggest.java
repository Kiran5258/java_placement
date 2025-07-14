
import java.util.*;

public class Nextbiggest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int left = 0;
        // while (left < n) {
        //     int right = left + 1;
        //     int max = -1; 
        //     while (right < n) {
        //         if (arr[right] > arr[left]) {
        //             max = arr[right];
        //             break;
        //         }
        //         right++;
        //         if(arr[right]<arr[left] && left!=0)
        //             right=0;
        //     }
        //     System.out.print(arr[left] + " -->");
        //     if(max!=-1)
        //     System.out.print(max);
        //     System.out.print(',');
        //     left++;
        // }
        for(int i=0;i<n;i++){
            int max=0;
            for(int j=0;j<n;j++){
                if(arr[j]>arr[i])
                max=arr[j];
                else if (arr[j]>arr[i]&& arr[j]<max)
                max=arr[j];
            }
            System.out.print(arr[i]+"-->");
            if(max!=0 && i!=n){
                System.out.print(max+",");
            }
            else if(max!=0 && i==n-1){
                System.out.print(max);
            }
            else if(max==0 && i!=n-1)
            System.out.print(",");
        }
        sc.close();
    }
}
