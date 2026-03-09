package Array;
import java.util.Scanner;
public class Eighteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        int index=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
                index=i+1;
            }
        }
        double avg=(double)sum/n;
        System.out.println("total products: "+n);
        System.out.printf("avg monthly sales: %.2f\n",avg);
        System.out.print("best-seller: product "+index);
        System.out.println("("+max+" units)");
        double num=avg*0.5;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<num){
                count++;
            }
        }
        System.out.println("slow-moving products: "+count);
        System.out.printf("turnover threshold: %.2f units\n",num);
        System.out.print("clearance candidate: [");
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
