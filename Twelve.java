package Array2;
import java.util.Scanner;
public class Twelve {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][7];
        for(int i=0;i<4;i++){
            for(int j=0;j<7;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Rainfall data: ");
        for(int i=0;i<4;i++){
            for(int j=0;j<7;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int sum=0;
        int count=0;
        int index=0;
        int zero=0;
        System.out.println("Weekly totals: ");
        for(int i=0;i<4;i++){
            sum=0;
            System.out.print("Week "+(i+1)+": ");
            for(int j=0;j<7;j++){
                sum+=arr[i][j];
            }
            if(sum==0){
                zero=sum;
                index=i+1;
            }
            System.out.print(sum+" mm");
            System.out.println();
            count+=sum;
        }
        System.out.println("monthly total: "+count+" mm");
        System.out.println("Driest week: week "+index+" ("+zero+" mm)");
    }
}
