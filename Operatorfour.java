package Operators;
import java.util.Scanner;
public class Operatorfour {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int credit=sc.nextInt();
        int purchase=sc.nextInt();
        int block=sc.nextInt();
        if(purchase<=credit&&block==0){
            System.out.println("Approved.");
        }
        else{
            System.out.println("Declined.");
        }
    }
    
}

