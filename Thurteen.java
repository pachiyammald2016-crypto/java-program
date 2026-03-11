package Array2;
import java.util.Scanner;
public class Thurteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Seating map: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
        }
        System.out.println("Total occupied: "+count);
        int seats=n*m;
        int rate=(count*10000)/seats;
        System.out.println("Occupancy rate: "+rate+"%");
        int sum=0;
        int index=0;
        System.out.print("Empty rows: [");
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=0;j<m;j++){
                sum+=arr[i][j];
            }
            if(sum==0){
                index=i;
                System.out.print(index);
            if(i<n-2){
                System.out.print(", ");
            }
        }
        }
        System.out.print("]");
    }
}
