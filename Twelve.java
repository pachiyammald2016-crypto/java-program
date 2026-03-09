package Array;
import java.util.Scanner;
public class Twelve {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] arr=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double limit=sc.nextDouble();
        int index=0;
        double max=0.0;
        double sum=0.0;
        for(int j=0;j<n;j++){
            sum+=arr[j];
            if(arr[j]>max){
                max=arr[j];
                index=j;
            }
        }
        String r="";
        double avg=(double)sum/n;
        System.out.println("Hours Monitored: "+n);
        System.out.printf("total daily consumption:%.2f kwh\n",sum);
        System.out.print("peak hour: hour "+index);
        System.out.printf("( %.2f kwh)\n",max);
        System.out.printf("average hourly:%.2f kwh\n",avg);
        System.out.printf("Daily limit:%.2f kwh\n",limit);
        double t=(double)sum-limit;
        if(sum<limit){
            r="Within limit";
            System.out.println("Status: "+r);
        }
        else{
            r="Exceeded by";
            System.out.printf("Exceeded by %.2f kwh",t);
        }
    }
}
