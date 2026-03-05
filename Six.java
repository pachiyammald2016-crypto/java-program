package While;
import java.util.Scanner;
public class Six {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int rem=0;
        do {
            System.out.print("Enter amount (0 to exit): ");
            m = sc.nextInt();

            if(m == 0) {
                System.out.println("Transaction ended.");
            }
            else if(m > n){
                System.out.println("Insufficient funds! Try again.");
            }
            else{
                n = n - m;
                System.out.println("Withdrawal successful! Remaining balance: " + n);
            }

        } while(m != 0);
    }
}
