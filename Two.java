package Array2;
import java.util.Scanner;
public class Two {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int s=sc.nextInt();
        char[][] arr=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]='A';
            }
        }
        for(int k=0;k<s;k++){
            int p=sc.nextInt();
            int r=sc.nextInt();
            arr[p][r]='B';
        }
        System.out.println("Seating chart: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int num=n*m;
        int total=num-s;
        int rate=(s*10000)/num;
        System.out.println("Total seats: "+num);
        System.out.println("booked seats: "+s);
        System.out.println("Available seats: "+total);
        System.out.println("Occupancy rate: "+rate+"%");
    }
}
