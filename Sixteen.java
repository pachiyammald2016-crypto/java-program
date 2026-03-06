package While;
import java.util.Scanner;
import java.lang.Math;
public class Sixteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=0;
        int i=1;
        int power=0;
        while(n>0){
            int digit=n%10;
            power=digit*i;
            result+=power;
            n=n/10;
            i+=i;
        }
        System.out.println(result);
    }
}
