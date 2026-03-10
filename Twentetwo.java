package Array;
import java.util.Scanner;
public class Twentetwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] arr=new double[n];
        double max=Double.MIN_VALUE;
        double min=Double.MAX_VALUE;
        double sum=0.0;
        int index=0;
        int index1=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
            if(arr[i]<min){
                min=arr[i];
                index1=i;
            }  
        }
        double avg=(double)sum/n;
        System.out.println("total posts: "+n);
        System.out.printf("average engagement: %.2f%%\n",avg);
        System.out.printf("peak engagement: %.2f%%",max);
        System.out.println("(post "+index+")");
        System.out.printf("lowest engagement: %.2f%%",min);
        System.out.println("(post "+index1+")");
        double num=avg*2.0;
        int index2=0;
        for(int i=0;i<n;i++){
            if(arr[i]>num){
                index2++;
            }
        }
        System.out.println("viral posts(>200% avg): "+index2);
        System.out.printf("viral threshold: %.2f%%\n",num);
        System.out.print("top performance: [");
        for(int i=0;i<n;i++){
            if(arr[i]>num){
                System.out.print(i+1);
                if(i<n-2){
                    System.out.print(", ");
                }
            }
        }
        System.out.print("]");
    }
}
