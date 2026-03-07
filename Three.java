package Array;
import java.util.Scanner;
public class Three {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int count=0;
        int num=0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<40){
                count++;
            }
        }
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        num=size-count;
       double percent=((double)num/size)*100.0;
        System.out.println("Total Students: "+size);
        System.out.println("Highest Score: "+max);
        System.out.println("lowest Score: "+min);
        System.out.println("Failed Students: "+count);
        System.out.printf("Pass percentage:%.2f%% ",percent);
    }
}
