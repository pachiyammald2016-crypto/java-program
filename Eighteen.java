package While;
import java.util.Scanner;
public class Eighteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=a;
        int r=b;
        int gcd=0;
        int lcm=0;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
            gcd=a;
        }
        System.out.println(gcd);
        lcm=m*r/gcd;
        System.out.println(lcm);
    }
}
