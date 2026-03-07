package Array;
import java.util.Scanner;
public class Two {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int thresh=sc.nextInt();
        int[] arr=new int[size];
        int count=0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<thresh){
                count++;
            }
        }
        System.out.println("Total products: "+size);
        System.out.println("minimum threshold: "+thresh);
        System.out.println("low stock products: "+count);
        System.out.print("product indices: ");
        System.out.print("[");
        for(int i=0;i<size;i++){
            if(arr[i]<thresh){
                System.out.print(i);
                if(i<size-2){
                System.out.print(", ");
                }
            }
        }
        System.out.print("]");
    }
}
