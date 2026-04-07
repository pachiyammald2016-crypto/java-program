package Array2;
import java.util.Scanner;
public class Five {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        int sum = 0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int index=0;
        int index1=0;
        int index2=0;
        int index3=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
                if(arr[i][j]>max){
                    max=arr[i][j];
                    index=i;
                    index1=j;
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                    index2=i;
                    index3=j;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int avg=sum/n*m;
        System.out.println("maximum temp: "+max+" c at position ("+index+", "+index1+")");
         System.out.println("maximum temp: "+min+" c at position ("+index2+", "+index3+")");
        System.out.println("avg temp: "+avg+" c");
    }
}
