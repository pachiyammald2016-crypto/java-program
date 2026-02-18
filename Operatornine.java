package Operators;
import java.util.Scanner;
public class Operatornine {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int username=sc.nextInt();
        int password=sc.nextInt();
        int account=sc.nextInt();
        if(username==1&&password==1&&account==0){
            System.out.println("Success");
        }
        else{
            System.out.println("Failed");
        }
    }
}
