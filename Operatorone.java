package Operators;
import java.util.Scanner;
public class Operatorone {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int theory=sc.nextInt();
        int practical=sc.nextInt();
        int num1;
        if(theory>50&&practical>50){
            num1=(theory+practical)/2;
            if(num1>60){
                System.out.println("Pass");
            }
        }
        else{
            System.out.println("Fail");
        }
    }
}
