package Array2;
import java.util.Scanner;
public class Three {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[][] a=new int[n][m];
    int[][] b=new int[n][m];
    int[][] sum=new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            b[i][j]=sc.nextInt();
        }
    }
    System.out.println("Matrix 1:" );
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();
    System.out.println("Matrix 2:" );
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(b[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            sum[i][j]=a[i][j]+b[i][j];
        }
    }
    System.out.println("Sum Matrix: ");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(sum[i][j]+" ");
        }
        System.out.println();
    }
   } 
}


