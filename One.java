package Array2;
import java.util.Scanner;
public class One {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        int sum=0;
        int avg=0;
        System.out.println("Student average: ");
        for(int i=0;i<n;i++){
            sum=0;
            System.out.print("Student "+i+": ");
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
            }
            avg=sum/m;
            System.out.print(avg*100);
            System.out.println();
        }
        int num=0;
        int count=0;
        System.out.println();
        System.out.println("Subject averages: ");
        for(int r=0;r<m;r++){
            count=0;
            System.out.print("student "+r+": ");
            for(int s=0;s<n;s++){
                count+=arr[s][r];
            }
            num=count/n;
            System.out.print(num*100);
            System.out.println();
        }
    }
}
