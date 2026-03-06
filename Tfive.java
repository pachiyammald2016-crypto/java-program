package While;
import java.util.Scanner;
public class Tfive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        do{
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
        while(m>n);
    }
}
