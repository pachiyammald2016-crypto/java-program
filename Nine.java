package While;
import java.util.Scanner;
public class Nine {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int number=1;
        int i=2;
        while(i<(n/2)){
            if(n%i==0){
                number=0;
                break;
            }
             i++;
        }
        if(number==1){
            System.out.println(n+" is prime");
        }
        else{
            System.out.println(n+" is not prime"); 
        }
    }
}
