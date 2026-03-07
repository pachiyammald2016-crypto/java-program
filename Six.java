package Array;
import java.util.Scanner;
public class Six {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        double[] arr=new double[size];
        double sum=0.0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextDouble();
            sum+=arr[i];
        }
        int count=0;
        double avg=(double)sum/size;
        for(int i=0;i<size;i++){
            if(arr[i]>avg){
                count++;
            }
        }
        System.out.println("Fraud Alert Indices: ");
        System.out.print("[");
        for(int i=0;i<size;i++){
            if(arr[i]>avg){
              System.out.print(i);
              if(i<size-2){
              System.out.print(", ");  
              }
            }
        }
        System.out.print("]");
    }
}
