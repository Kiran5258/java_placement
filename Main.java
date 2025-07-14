import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int rsize = scan.nextInt();
	int csize = scan.nextInt();
	int arr[][] = new int [rsize][csize];
	for(int i=0;i<rsize;i++){
	    for(int j=0;j<csize;j++){
	        arr[i][j]=scan.nextInt();
	    }
	}
	int max = Integer.MIN_VALUE;
	int row[]=new int[rsize];
	int col [] = new int[csize];
	for(int i=0;i<rsize;i++){
	    for(int j=0;j<csize;j++){
	        row[i]=row[i]+arr[i][j];
	        col[i]=col[i]+arr[j][i];
	    }
	    if(row[i]>max){
	            max=row[i];
	        }
	        if(col[i]>max){
	            max=col[i];
	        }
	}
	System.out.println(max);
	for(int i=0;i<rsize;i++){
	    System.out.println("The sum of row"+i+" "+row[i]);
	}
	for(int i=0;i<csize;i++){
	    System.out.println("The sum of col"+i+" "+col[i]);
	}
    scan.close();
	}
}