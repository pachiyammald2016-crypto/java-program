package Array2;
import java.util.Scanner;
public class Eight {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int s=sc.nextInt();
    int[][] arr=new int[n][m];
    System.out.println("original image:");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();
    System.out.println("Adjusted image: ");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(arr[i][j]<255){
                arr[i][j]=arr[i][j]+s;
            }
            if(arr[i][j]>255){
                arr[i][j]=255;
            }
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
   } 
}
