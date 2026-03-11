package Array2;
import java.util.Scanner;
public class Seven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        int sum=0;
        System.out.println("inventary grid: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("total inventary: "+sum);

        System.out.print("max stock zone: ");
        int max=Integer.MIN_VALUE;
        int index=0;
        int index2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                    index=i;
                    index2=j;
                }
            }
        }
        int avg=sum/(n*m);
        System.out.println("row "+index+", col "+index2+" ("+max+" units)");
        System.out.println("avg stock per zone: "+avg);
    }
}
