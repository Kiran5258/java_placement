// 1.Raveena has a list of integers representing her daily profits and losses from a series of investments over n days. Some days she makes a profit (positive numbers), and other days she incurs a loss (negative numbers). Raveena wants to find out the maximum profit she can achieve by selecting a continuous subsequence of days.

// Write a program that takes the number of days n as input, followed by a list of n integers representing Raveena's daily profits and losses. Your task is to find the maximum possible profit that can be achieved from any continuous subsequence of these days and print that profit. Additionally, print the subsequence of days that gives this maximum profit.

// You must use pointer arithmetic to traverse the list of integers and perform the required operations.

// For example, in an array [ −2, 1, −3, 4, −1, 2, 1, −5, 4], the contiguous subarray [4, −1, 2, 1] has the largest sum, which is 6.

// Input format :
// The first line contains an integer N, the number of days.

// The second line contains N space-separated integers, each representing the profit or loss on that day.

// Output format :
// The first line should contain the maximum profit that Raveena can achieve.

// The second line should contain the continuous subsequence of days (as integers) that contributes to this maximum profit.
// Refer to the sample output for the formatting specifications.

// Code constraints :
// 1 ≤ N ≤ 100

// Sample test cases :
// Input 1 :
// 9
// -2 1 -3 4 -1 2 1 -5 4
// Output 1 :
// 6
// 4 -1 2 1 

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
