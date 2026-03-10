package Array;
import java.util.Scanner;
public class Twentefour {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] arr=new double[n];
        double sum=0.0;
        double max=Double.MIN_VALUE;
        double min=Double.MAX_VALUE;
        int index=0;
        int index1=0;
        int index2=0;
        int index3=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
                index=i+1;
            }
            if(arr[i]<min){
                min=arr[i];
                index1=i+1;
            }
        }
        double avg=(double)sum/n;

        System.out.println("Total properties: "+n);
        System.out.printf("Portfolio value:$%.2f\n ",sum);
        System.out.printf("average property value:$%.2f\n ",avg);
        System.out.printf("most valuable:$%.2f ",max);
        System.out.println(" (property "+index+")");
        System.out.printf("least valuable:$%.2f ",min);
        System.out.println(" (property "+index1+")");
        double total=avg*0.7;
        double s=avg*1.5;
        for(int i=0;i<n;i++){
            if(arr[i]<total){
                index2++;
            }
            if(arr[i]>s){
                index3++;
            }
        }
        System.out.println("Bargain properties:(<70% avg): "+index2);
        System.out.println("premium properties(<150% avg): "+index3);
    }
}
