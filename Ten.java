package While;
import java.util.Scanner;
public class Ten {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=3;
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(i<=n){
            int temp=a+b;
            a=b;
            b=temp;
            i++;

            System.out.print(temp+" ");
        }
    }
}
