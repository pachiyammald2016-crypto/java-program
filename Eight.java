package Array;
import java.util.Scanner;
public class Eight {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int max=Integer.MIN_VALUE;
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]>60){
                count++;
            }
        }
        double avg=(double)sum/n;
        int total=n-count;
        double num=((double)total/n)*100.0;
        System.out.println("Total patients: "+n);
        System.out.println("longest wait time: "+max+" minutes");
        System.out.printf("Average wait time:%.2f Minutes\n",avg);
        System.out.println("Patients waiting >60 min: "+count);
        System.out.printf("Service level:%.2f%%",num);
    }
}
