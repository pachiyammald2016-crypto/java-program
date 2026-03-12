package Array2;
import java.util.Scanner;
public class Twenteone {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][] arr=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][] a=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                a[i][j]=sc.nextInt();
            }
        }
         int[][] am=new int[r1][c2];

        System.out.println("Matrix A: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Matrix B: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                am[i][j]+=arr[i][j]*a[i][j];
            }
        }
        System.out.println();
        System.out.println("Result matrix: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(am[i][j]+" ");
            }
            System.out.println();
        }

    }
}