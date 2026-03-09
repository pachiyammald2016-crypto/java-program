package Array;
import java.util.Scanner;
public class Sixteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        int count=0;
        int count1=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
                count=i+1;
            }

        }
        int avg=sum/n;
        double s=(int)avg*1.5;
        System.out.println("trading days: "+n);
        System.out.println("total volume: "+sum);
        System.out.println("avg daily volume: "+avg);
        System.out.print("peak volume days: day "+count);
        System.out.println("("+max+")");
        for(int i=0;i<n;i++){
            if(arr[i]>s){
                count1++;
            }
        }
        System.out.println("high volume days(>150% avg): "+count1);
        System.out.print("Breakout signal days: [");
        for(int i=0;i<n;i++){
            if(arr[i]>s){
                System.out.print(i);
                if(i<n-2){
                    System.out.print(", ");
                }
            }
        }
        System.out.print("]");
        
    }
}
