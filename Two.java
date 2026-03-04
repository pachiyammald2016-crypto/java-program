package While;
import java.util.Scanner;
public class Two {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=1;
        int sum=0;
        int count=0;
        while(n!=0){
            n=sc.nextInt();
            sum+=n;
            if(n>0){
            count++;
            }
            System.out.println("Enter number(0 to stop):"+n);
        }
        System.out.println("Total sum: "+sum);
        System.out.println("Count: "+count);
    }
}
