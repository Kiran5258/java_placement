// ✅ Sample Input:
// Copy
// Edit
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// ✅ Sample Output:
// mathematica
// Copy
// Edit
// 1 2 3 
// 4 5 6 
// 7 8 9 
// Sum of row 0 = 6
// Sum of row 1 = 15
// Sum of row 2 = 24
// Sum of col 0 = 12
// Sum of col 1 = 15
// Sum of col 2 = 18
// 24
// 🧠 Explanation:
// Row sums: 6, 15, 24

// Column sums: 12, 15, 18

// Maximum among all: 24


import java.util.*;
public class Sumrowsumcolmax{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][]mat=new int[row][col];
        int max=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<row;i++){
            int sumrow=0;
            for(int j=0;j<=col;j++){
                if(j!=col)
                    sumrow=sumrow+mat[i][j];
                else {
                    System.out.println("sum of row "+row+" = "+sumrow);
                    if(max<sumrow)max=sumrow;
                }
            }

        }
        for(int i=0;i<col;i++){
            int sumcol=0;
            for(int j=0;j<=col;j++){
                if(j!=col)
                sumcol=sumcol+mat[j][i];
                else {
                    System.out.println("sum of col = "+sumcol);
                    if(max<sumcol)
                    max=sumcol;
                }           
            }
        }
        System.out.println(max);
        sc.close();
    }
}