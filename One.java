package String;
import java.util.Scanner;
public class One {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();

    String num="^[A-Za-z0-9.+%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

    int valid=0;
    int invalid=0;
    System.out.println("Email Validation Results: ");
    for(int i=0;i<n;i++){
      String p=sc.nextLine();

      if(p.matches(num)){
         int s=i+1;
         System.out.println(s+". "+p+" - "+"Valid");
         valid++;
      }
      else{
         int s=i+1;
         System.out.println(s+". "+p+" - "+"Invalid");
         invalid++;
      }
    }
    System.out.println("total valid: "+valid);
    System.out.println("total invalid: "+invalid);
   } 
}
