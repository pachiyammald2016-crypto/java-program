package Array;
import java.util.Scanner;
public class Twenteone {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] arr=new double[n];
        double sum=0.0;
        double max=Double.MIN_VALUE;
        double min=Double.MAX_VALUE;
        int index1=0;
        int index2=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
                index1=i+1;
            }
            if(arr[i]<min){
                min=arr[i];
                index2=i+1;
            }
        }
        double avg=(double)sum/n;
        System.out.println("fleet size: "+n);
        System.out.printf("avg fuel efficiency:%.2f MPG\n",avg);
        System.out.printf("most efficient:%.2f MPG",max);
        System.out.println("(vehicle "+index1+")");
        System.out.printf("least efficient:%.2f MPG",min);
        System.out.println("(vehicle "+index2+")");
        double num=avg*0.8;
        int index3=0;
        for(int i=0;i<n;i++){
            if(arr[i]<num){
                index3++;
            }
        }
        System.out.println("underperforming vehicle: "+index3);
        System.out.printf("efficiency threshold:%.2f MPG\n",num);
        System.out.print("maintenance priority: [");
        for(int i=0;i<n;i++){
            if(arr[i]<num){
                System.out.print(i);
                if(i<n-2){
                    System.out.print(", ");
                }
            }
        }
        System.out.print("]");

    }
}
