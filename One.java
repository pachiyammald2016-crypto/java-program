package While;
import java.util.Scanner;
public class One {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String n=sc.nextLine();
    int count=3;
    while(count>0){
        System.out.println("Enter password: ");
        String s=sc.nextLine();

        if(s.equals(n)){
            System.out.println("Access granted!");
            break;
        }
        else{
            count--;
            if(count>0){
                System.out.println("Incorrect attempts! remaining: "+count);
            }
            else{
                System.out.println("Account locked!");
            }
        }
    }

   } 
}
