package Array;
import java.util.Scanner;
public class Twentethree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
                index=i+1;
            }
        }
        double num=(double)sum/n;
        System.out.println("production lines: "+n);
        System.out.printf("total output: "+sum+" units");
        System.out.printf("average output:%.2f units/hour\n",num);
        System.out.print("top producer: line "+index);
        System.out.println("("+max+" units)");
        double total=num*0.9;
        System.out.printf("performance threshold:%.2f units\n",total);
        int index2=0;
        System.out.print("priority lines: [");
        for(int i=0;i<n;i++){
            if(arr[i]<total){
                System.out.print(i+1);
                if(i<n-2){
                    System.out.print(", ");
                }
                index++;
            }
        }
        System.out.print("]");


    }
}
