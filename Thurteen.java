package While;
import java.util.Scanner;
public class Thurteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int i=1;
        int fact=1;
        while(i<=a){
            fact*=n;
            i++;
        }
        System.out.println(n+"^"+a+" = "+fact);
    }
}
