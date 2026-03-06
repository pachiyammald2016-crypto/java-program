package While;
import java.util.Scanner;
public class Seventeen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int org=n;
        int count=n/2;
        int i=1;
        int sum=0;
        while(i<=count){
            if(n%i==0){
                sum+=i;
            }
            i++;
        }
        if(sum==org){
            System.out.println(org+" is a perfect number");
        }
        else{
            System.out.println(org+" is not a perfect number");
        }
    }
}
