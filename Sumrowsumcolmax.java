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