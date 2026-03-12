package Array2;
import java.util.Scanner;
public class Ninteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("original image: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int[][] a=new int[n/2][n/2];
        for(int i=0;i<n;i+=2){
            for(int j=0;j<n;j+=2){
                a[i/2][j/2]=arr[i][j];
            }
        }
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n/2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
