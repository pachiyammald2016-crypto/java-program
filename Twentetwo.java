package Array2;
import java.util.Scanner;
public class Twentetwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a = new int[n][m];
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=m-1;
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        while(top<=bottom&&left<=right){
            for(int i=left;i<=right;i++){
                System.out.print(a[top][i]+" ");
            }
             top++;
            for(int i=top;i<=bottom;i++){
               System.out.print( a[i][right]+" ");
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                System.out.print(a[bottom][i]+" ");
            }
            bottom--;
        }
        if(left<=right){
            for(int i=bottom;i>=top;i--){
                System.out.print(a[i][left]+" ");
            }
            left++;
        }
        }
    }
}
