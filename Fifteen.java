package Array;
import java.util.Scanner;
public class Fifteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>300){
                count++;
            }
        }
        double avg=(double)sum/n;
        int total=n-count;
        double s=((double)total/n)*100;
        System.out.println("Total calls: "+n);
        System.out.printf("Average Handling time:%.2f seconds\n",avg);
        System.out.println("shortest call: "+min+" seconds");
        System.out.println("longest call: "+max+" seconds");
        System.out.println("Calls Exceeding target(300s): "+count);
        System.out.printf("Target complience:%.2f%% ",s);
    }
}
