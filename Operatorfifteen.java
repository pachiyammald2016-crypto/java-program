package Operators;
import java.util.Scanner;
public class Operatorfifteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int signal=sc.nextInt();
        int toggle=sc.nextInt();
        int count=signal^toggle;
        System.out.println(count);
    }
}
