package Array;
import java.util.Scanner;
public class Seven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=sc.nextInt();
        int[] arr=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                count++;
            }
        }
        int num=n-count;
        double sum=((double)num/n)*100.0;
        System.out.println("Production lines: "+n);
        System.out.println("Acceptable Threshold: "+max);
        System.out.println("lines exceeding threshold: "+count);
        System.out.print("[");
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                System.out.print(i+1);
                if(i<n-2){
                System.out.print(", ");
            }
            }
        }
        System.out.print("]");
        System.out.println();
        System.out.printf("Compliance rate:%.2f%%",sum);
    }
}
