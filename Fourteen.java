package While;
import java.util.Scanner;
public class Fourteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int org=n;
        int sum=0;
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        n=org;
        while(n!=0){
            int digit=n%10;
            int fact=1;
          for(int i=1;i<=count;i++){
            fact*=digit;
        }
        sum+=fact;
         n=n/10;
    }
    if(sum==org){
        System.out.println(sum+" is amstrong number");
    }
    else{
        System.out.println(sum+" is not amstrong number");
    }

    }
}
