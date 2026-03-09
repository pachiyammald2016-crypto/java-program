package Array;
import java.util.Scanner;
public class Seventeen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] arr=new double[n];
        double sum=0.0;
        double max=Double.MIN_VALUE;
        double min=Double.MAX_VALUE;
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>8.5&&arr[i]<6.5){
                count++;
            }
        }
        double avg=(double)sum/n;
        System.out.println("total samples: "+n);
        System.out.printf("avg pH: %.2f\n",avg);
        System.out.printf("max pH: %.2f\n",max);
        System.out.printf("min pH: %.2f\n",min);
        System.out.println("unsafe samples: "+count);
        int num=n-count;
        double total=((double)num/n)*100;
        System.out.printf("safety complience: %.2f%%\n",total);
        System.out.print("Critical alerts: [");
        for(int i=0;i<n;i++){
            if(arr[i]>8.5&&arr[i]<6.5){
                System.out.print(i);
                if(i<n-2){
                    System.out.print(", ");
                }
            }
        }
        System.out.print("]");
    }
}
