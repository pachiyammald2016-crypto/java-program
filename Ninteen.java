package While;
import java.util.Scanner;
public class Ninteen {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int rev=0;
      while(n>0){
        int digit=n%2;
        rev=rev*10+digit;
        n=n/2;
      }  
      System.out.println(rev);
    }
}
