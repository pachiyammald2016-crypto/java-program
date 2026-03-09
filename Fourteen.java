package Array;
import java.util.Scanner;
public class Fourteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] arr=new double[n];
        double max=Double.MIN_VALUE;
        double sum=0.0;
        int index=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        double avg=(double)sum/n;
        double total=avg*0.8;
        System.out.println("Total plots: "+n);
        System.out.printf("total harvest:%.2f tons\n",sum);
        System.out.printf("average yield:%.2f tons/acre\n",avg);
        System.out.printf("highest yield:%.2f tons/acre ",max);
        System.out.println("(plot "+index+")");
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<total){
                count++;
            }
        }
        System.out.println("Underperforming plots: "+count);
        System.out.printf("performance threshold:%.2f tons/acre",total);

    }
}
