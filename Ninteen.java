package Array;
import java.util.Scanner;
public class Ninteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tar=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        int index=0;
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<tar){
                count++;
            }
        }
        double avg=(double)sum/n;
        int num=n-count;
        double total=((double)num/n)*100.0;
        System.out.println("days tracked: "+n);
        System.out.println("total calories burned: "+sum);
        System.out.printf("avg daily burn: %.2f\n",avg);
        System.out.print("peak burn: day "+index);
        System.out.println("("+max+" calorie)");
        System.out.println("days below target: "+count);
        System.out.printf("goal acheivement: %.2f%%",total);

    }
}
