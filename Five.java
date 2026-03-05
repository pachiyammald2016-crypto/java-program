package While;
import java.util.Scanner;
public class Five {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int org=n;
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println("Original: "+org);
        System.out.println("Reversed: "+rev);
    }
}
