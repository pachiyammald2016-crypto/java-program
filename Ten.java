package Array2;
import java.util.Scanner;
public class Ten {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        int sum=0;
        System.out.println("sales matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("representative totals: ");
        for(int i=0;i<n;i++){
            sum=0;
            System.out.print("rep "+i+": ");
            for(int j=0;j<m;j++){
                sum+=arr[i][j];
            }
            System.out.println(sum);
        }
        System.out.println();
        System.out.println("terrinary totals: ");
        int sum2=0;
        for(int i=0;i<m;i++){
            sum2=0;
            System.out.print("terrinary "+i+": ");
            for(int j=0;j<n;j++){
                sum2+=arr[j][i];
            }
            System.out.println(sum2);
        }
    }
}
