package Array;
import java.util.Scanner;
public class Twente {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int index=0;
        int index1=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
                index=i+1;
            }
            if(arr[i]<min){
                min=arr[i];
                index1=i;
            }
        }
        double avg=(double)sum/n;
        double num=avg*0.6;
        int index2=0;
        for(int i=0;i<n;i++){
            if(arr[i]<60){
                index2++;
            }
        }
        double total=n-index2;
        double s=((double)total/n)*100;
        System.out.println("total students: "+n);
        System.out.printf("avg complience: %.2f%%\n",avg);
        System.out.print("high com: "+max+"%");
        System.out.println("(student "+index+")");
         System.out.print("low com: "+min+"%");
        System.out.println("(student "+index1+")");
        System.out.println("at-risk students(<60%): "+index2);
        System.out.printf("success rate: %.2f%%",s);


    }
}
