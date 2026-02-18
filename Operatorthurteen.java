package Operators;
import java.util.Scanner;
public class Operatorthurteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int connection=sc.nextInt();
        int mask=sc.nextInt();
        int count=connection&mask;
        if(count!=0){
            System.out.println("Active");
        }
        else{
            System.out.println("Inactive");
        }
    }
}
