package Ifelse;
import java.util.Scanner;
public class Four {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String loyalty=sc.next();
        double cartvalue=sc.nextDouble();
        String product=sc.next();
        String membership=sc.next();
        int discount=0;
        int bonus=0;
        int total=0;
        if(loyalty.equals("bronze")){
            total=5;
            if(cartvalue>=500&&cartvalue<=999){
                discount=3;
            }
            else if(cartvalue>=1000&&cartvalue<=1999){
                discount=5;
            }
            else if(cartvalue>=2000){
                discount=7;
            }
        }
        else if(loyalty.equals("silver")){
            total=8;
            if(cartvalue>=500&&cartvalue<=999){
                discount=3;
            }
            else if(cartvalue>=1000&&cartvalue<=1999){
                discount=5;
            }
            else if(cartvalue>=2000){
                discount=7;
            }
        }
        else if(loyalty.equals("gold")){
            total=12;
            if(cartvalue>=500&&cartvalue<=999){
                discount=3;
            }
            else if(cartvalue>=1000&&cartvalue<=1999){
                discount=5;
            }
            else if(cartvalue>=2000){
                discount=7;
            }
        }
        else if(loyalty.equals("platinum")){
            total=15;
            if(cartvalue>=500&&cartvalue<=999){
                discount=3;
            }
            else if(cartvalue>=1000&&cartvalue<=1999){
                discount=5;
            }
            else if(cartvalue>=2000){
                discount=7;
            }
        }
        if(product.equals("electronics")){
            if(membership.equals("prime")){
                bonus=5;
            }
            else{
                bonus=0;
            }
        }
        else if(product.equals("fashion")){
            if(membership.equals("prime")){
                bonus=3;
            }
            else{
                bonus=3;
            }
        }
         else if(product.equals("books")){
            if(membership.equals("prime")){
                bonus=5;
            }
            else{
                bonus=0;
            }
        }
         else if(product.equals("groceries")){
            if(cartvalue>3000){
                bonus=2;
            }
        }
        double num=bonus+discount;
        double num1=num+total;
        double price=cartvalue*(1-num1/100);
        double savings=cartvalue-price;
        System.out.println("loyalty: "+loyalty);
        System.out.println("cart value: "+cartvalue);
        System.out.println("product: "+product);
        System.out.println("membership: "+membership);
        System.out.println("base discount: "+total+"%");
        System.out.println("additional discount: "+num+"%");
        System.out.println("additional discount: "+num1+"%");
        System.out.println("final price: "+"$"+price);
        System.out.println("savings: "+"$"+savings);
    }
}
