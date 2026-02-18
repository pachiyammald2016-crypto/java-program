package Operators;
import java.util.Scanner;
public class Operatorseven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cart=sc.nextInt();
        int prem=sc.nextInt();
        if(cart>999||prem==1){
            System.out.println("Free Shipping");
        }
        else{
            System.out.println("Charges Applied");
        }
    }
}
