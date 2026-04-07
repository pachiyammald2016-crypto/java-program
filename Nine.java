package Array2;
import java.util.Scanner;
public class Nine {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        System.out.println("Elevation map:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
                System.out.print(arr[i][j]+" ");
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println();
        int range=max-min;
        System.out.println("highest point: "+max+" m");
        System.out.println("lowest point: "+min+" m");
        System.out.println("elevation range: "+range+" m");

    }
}
