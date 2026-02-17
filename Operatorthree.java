package Operators;
import java.util.Scanner;
public class Operatorthree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int hours=sc.nextInt();
        int atten=sc.nextInt();
        if(hours>40 && atten>90){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
