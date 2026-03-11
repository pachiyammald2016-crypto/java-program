package Array2;
import java.util.Scanner;
public class Six {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        int sum=0;
        int sum2=0;
        System.out.println("traffic data: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("total traffic per lane: ");
        for(int i=0;i<n;i++){
            System.out.print("lane "+i+": ");
            sum=0;
            for(int j=0;j<m;j++){
                sum+=arr[i][j];
            }
            System.out.print(sum);
            System.out.println();
        }
        System.out.println();
        System.out.print("busiest hour: hour ");
        int index=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            sum2=0;
            for(int j=0;j<n;j++){
                sum2+=arr[j][i];
            }
            if(sum2>max){
                max=sum2;
                index=i;
            }
        }
        System.out.println(index+" with "+max+" vehicles");

    }
}
