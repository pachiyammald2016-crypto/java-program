package While;
import java.util.Scanner;
public class Fifteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int org=n;
        int count=0;
        do{
            if(n%2==0){
                n=n/2;
            }
            else{
                n=3*n+1;
            }
           System.out.println(n);
            count++;
        }
        while(n!=1);
        System.out.println("steps: "+count);
    }
}
