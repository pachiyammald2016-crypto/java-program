package String;
import java.util.Scanner;
public class Sixteen {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    int count=0;
    System.out.println("Critical Logs: ");
    for(int i=0;i<n;i++){
        String s=sc.nextLine();
        if(s.contains("ERROR")){
            count++;
            System.out.println(s);
        }
        if(s.contains("EXCEPTION")){
            count++;
            System.out.println(s);
        }
    }
    System.out.println("total errors found: "+count);
   } 
}
