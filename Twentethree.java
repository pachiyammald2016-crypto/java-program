package Array2;
import java.util.Scanner;
public class Twentethree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int num=0;
        int sum=0;
        for(int i=0;i<n;i++){
            num+=arr[i][i];
        }
        for(int j=0;j<n;j++){
            sum+=arr[j][n-j-1];
        }
        if(num==sum){
            System.out.println("result: Magic square");
        }
        else{
            System.out.println("result: not a magic square");
        }
        System.out.println("Constant: "+num);
    }
}