package While;
import java.util.Scanner;
public class Twente {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int org=n;
       int sum=0;
       while(n!=0){
        int digit=n%10;
         int fact=1;
        for(int i=1;i<=digit;i++){
            fact*=i;
        }
        sum+=fact;
        n=n/10;
       } 
       if(sum==org){
        System.out.println(org+" is strong number");
       }
       else{
        System.out.println(org+" is not strong number");
       }
    }
}
