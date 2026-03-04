package While;
import java.util.Scanner;
public class Three {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=1;
        int count=0;
        while(m!=0){
            m=sc.nextInt();
            count++;
            if(m>n){
                System.out.println("Guess the number(1100):"+m);
                System.out.println("Too High!");
            }
            else if(m<n){
                System.out.println("Guess the number(1100):"+m);
                System.out.println("Too Low!");
            }
            else{
                System.out.println("Guess the number(1100):"+m);
                System.out.println("Correct! Attempts:"+count);
            }


        }
    }
}
