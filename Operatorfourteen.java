package Operators;
import java.util.Scanner;
public class Operatorfourteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=a|b;
        if(count!=0){
            System.out.println(count);
        }
    }
}
