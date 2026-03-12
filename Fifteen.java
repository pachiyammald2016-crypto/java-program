package Array2;
import java.util.Scanner;
public class Fifteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int total=0;
        int[][] arr=new int[n][];
        for(int i=0;i<n;i++){
                int size=sc.nextInt();
                arr[i]=new int[size];
                for(int j=0;j<size;j++){
                    arr[i][j]=sc.nextInt();
                    total++;
            }
        }
        System.out.println("Employee contact book: ");
        for(int i=0;i<n;i++){
            System.out.print("dept "+(i+1)+": ");
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("total employee: "+total);
    }
}
