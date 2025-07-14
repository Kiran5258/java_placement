// "Stock Span Problem"

// 📄 Question Statement:
// Given the daily prices of a stock for n days, you need to calculate the stock span for each day.

// The stock span on a given day i is defined as the maximum number of consecutive days (up to and including day i) for which the stock price was less than or equal to the price on day i.

// However, in your current code, you're computing span using:

// java
// Copy
// Edit
// while (j >= 0 && arr[j] < arr[i])
// This means you're calculating the span based on previous days having a price less than the current day's price — a slightly modified version of the standard Stock Span.

// 📝 Custom Question Based on Your Code:
// Given an array of integers arr[0..n-1] representing the stock prices for n consecutive days, your task is to compute an array result[0..n-1] where result[i] is the number of consecutive previous days (including the current day) until a day is found with a price greater than or equal to the current day's price.

// If no such day exists, the span is the entire period up to day i + 1.

// ❗Note: For this specific problem, we consider only previous days where the price is strictly less than the current day's price.

// 📥 Input Format:
// An integer n — the number of days

// n space-separated integers — the stock prices on each day

// 📤 Output Format:
// n space-separated integers — the span for each day

// 📌 Sample Input:
// Copy
// Edit
// 7
// 100 80 60 70 60 75 85
// ✅ Output from Your Code:
// Copy
// Edit
// 1 1 1 2 1 4 6
// Let me know if you want the optimized version using a stack (O(n) instead of O(n²)).



import java.util.*;
class Profitelost{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int[]result=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int j=i-1;
            while(j>=0 && arr[j]<arr[i]){
                j--;
            }
            result[i]=i-j;
        }
       for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}