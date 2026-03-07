package Array;
import java.util.Scanner;
public class Five {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        double[] arr=new double[size];
        double max=Double.MIN_VALUE;
        double min=Double.MAX_VALUE;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextDouble();
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        double num=max-min;
        double diff=((double)num/max)*100;
        System.out.println("Number of Sellers: "+size);
        System.out.printf("Lowest Price:$%.2f\n",min);
        System.out.printf("Highest Price:$%.2f\n",max);
        System.out.printf("price difference:$%.2f\n",num);
        System.out.printf("Savings:%.2f%%",diff);
    }
}
