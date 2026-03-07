package Array;
import java.util.Scanner;
public class One {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        double[] arr=new double[size];
        int sum=0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextDouble();
            sum+=arr[i];
        }
        double avg=sum/size;
        int count=0;
        for(int j=0;j<size;j++){
            if(arr[j]>avg){
                count++;
            }
        }
        double percent=(double)count/size;
        double total=percent*100.0;

        System.out.println("Total Employees: "+size);
        System.out.printf("Average Salary:%.2f\n",avg);
        System.out.println("Employees above Average: "+count);
        System.out.printf("Percentage:%.2f%%\n",total);
    }
}
