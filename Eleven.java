package Array;
import java.util.Scanner;
public class Eleven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] a=new double[n];
        double[] b=new double[n];
        double sum=0.0;
        int index1=0;
        int index2=0;
        double max=Double.MIN_VALUE;
        double min=Double.MAX_VALUE;
        for(int i=0;i<n;i++){
            a[i]=sc.nextDouble();
            for(int j=i;j<=i;j++){
                b[j]=sc.nextDouble();
                double s=a[i]*b[j];
                sum+=s;
                if(b[j]>max){
                    max=b[j];
                    index1=(int)j;
                }
                if(b[j]<min){
                    min=b[j];
                    index2=(int)j;
                }
            }
        }
        System.out.println("Number of assets: "+n);
        System.out.printf("Total portfolio value:$%.2f",sum);
        System.out.println("most valuable asset: asset "+index2);
        System.out.println("least valuable asset: asset "+index1);
        
    }
}
