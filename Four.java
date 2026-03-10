package Array2;
import java.util.Scanner;
public class Four {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("Sales Data: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        int max=0;
        int index=0;
        System.out.println();
        System.out.println("product-wise total sales: ");
        for(int i=0;i<n;i++){
            sum=0;
            System.out.print("product "+i+": ");
            for(int j=0;j<m;j++){
                sum+=arr[i][j];
            }
            System.out.print(sum);
            System.out.println();
            if(sum>max){
                max=sum;
                index=i;
            }
        }
        System.out.println("product "+index+" with "+max+" units");
    }
}
