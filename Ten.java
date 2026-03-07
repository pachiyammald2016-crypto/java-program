package Array;
import java.util.Scanner;
public class Ten {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>200){
                count++;
            }
        }
        double avg=(double)sum/n;
        int num=n-count;
        double total=((double)num/n)*100.0;
        System.out.println("Total servers: "+n);
        System.out.println("Fastest response: "+min+" ms");
        System.out.println("Slowest response: "+max+" ms");
        System.out.printf("Average response:%.2f ms\n",avg);
        System.out.println("Slow Servers(>200ms): "+count);
        System.out.printf("performance score:%.2f%%",total);

    }
}
