package Array;
import java.util.Scanner;
public class Nine {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] arr=new double[n];
        double min=Double.MAX_VALUE;
        double max=Double.MIN_VALUE;
        double sum=0.0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        double avg=(double)sum/n;
        System.out.println("Total Score: "+n);
        System.out.printf("Highest Sales:$%.2f\n",max);
        System.out.printf("Lowest Sales:$%.2f\n",min);
        System.out.printf("Total Sales:$%.2f\n",sum);
        System.out.printf("Average Sales:$%.2f",avg);
    }
}
