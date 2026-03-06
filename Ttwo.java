package While;
import java.util.Scanner;
public class Ttwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int org=n;
        int sum=0;
        while(n<=m){
            if(n%2==0){
                sum+=n;
            }
            n++;
        }
        System.out.println("sum of even numbers from "+org+" to "+m+" : "+sum);

    }
}
