package Array;
import java.util.Scanner;
public class Twentefive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        int event1=0;
        int event2=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
                event1=i;
            }
            if(arr[i]<min){
                min=arr[i];
                event2=i;
            }
        }
        double avg=(double)sum/n;
        System.out.println("Security events analyzed: "+n);
        System.out.printf("Average risk score:%.2f \n",avg);
        System.out.print("highest risk event: "+max);
        System.out.println(" (event "+(event1+1)+")");
        System.out.printf("lowest risk event: "+min);
        System.out.println("(event "+(event2+1)+")");
        double num=avg*2.0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>num){
                count++;
            }
        }
        System.out.printf("thread threshold:%.2f\n ",num);
        System.out.println("critical threads(>200% avg): "+count);
        System.out.print("Alert events: ");
        System.out.print("[");
        for(int i=0;i<n;i++){
            if(arr[i]>num){
                System.out.print(i+1);
            if(i<n-2){
                System.out.print(", ");
            }
        }
        }
        System.out.print("]");
    }
}
