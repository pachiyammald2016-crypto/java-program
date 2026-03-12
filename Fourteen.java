package Array2;
import java.util.Scanner;
public class Fourteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        System.out.println("Original matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Rotated matrix (90 deg clockwise): ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[j][n-1-i]+" ");
            }
            System.out.println();
        }
    }
}
