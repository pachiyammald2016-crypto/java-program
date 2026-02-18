package Operators;
import java.util.Scanner;
public class Operatorsix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        int percent=sc.nextInt();
        if(income<200000&&percent>=75){
            System.out.println("Granted");
        }
        else{
            System.out.println("Not Granted");
        }
    }
}
