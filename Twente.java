package Array2;
import java.util.Scanner;
public class Twente {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        boolean num=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]!=arr[j][i]){
                    num=false;
                    break;
                }
            }
        }
        if(num){
            System.out.println("Symmetric");
        }
        else{
            System.out.println("Asymmetric");
        }
    }
}
