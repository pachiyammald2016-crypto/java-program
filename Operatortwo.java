package Operators;
import java.util.Scanner;
public class Operatortwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        int with=sc.nextInt();
        int daylimit=sc.nextInt();
        if(with<=balance&&with<daylimit){
            System.out.println("Approved");
        }
        else{
            System.out.println("Declined");
        }
    }
}
