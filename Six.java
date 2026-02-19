package Ifelse;
import java.util.Scanner;
public class Six {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String book=sc.next();
        int days=sc.nextInt();
        double seat=sc.nextDouble();
        String root=sc.next();
        double amount=0.0;
        double mul=0.0;
        String num="none";
        if(book.equals("economy")){
            if(root.equals("domestic")){
                amount=200.0;
            }
            else if(root.equals("in-short")){
                amount=500.0;
            }
            else if(root.equals("in-lng")){
                amount=800.0;
            }
        }
        else if(book.equals("business")){
            if(root.equals("domestic")){
                amount=600.0;
            }
            else if(root.equals("in-short")){
                amount=1500.0;
            }
            else if(root.equals("in-lng")){
                amount=2500.0;
            }
        }
        else if(book.equals("first")){
            if(root.equals("domestic")){
                amount=1000.0;
            }
            else if(root.equals("in-short")){
                amount=3000.0;
            }
            else if(root.equals("in-lng")){
                amount=5000.0;
            }
        }
        if(seat>30&&days<14){
            mul=1.8;
            num="high demand";
        }
        else if(seat<50&&days<30){
            mul=1.5;
            num="high demand";
        }
        else if(seat<60||days>=30&&days<=60){
            mul=1.0;
            num="moderate";
        }
        else if(seat>=60&&days>60){
            mul=0.8;
            num="low demand";
        }
        double total=amount*mul;
        System.out.println("booking class: "+book);
        System.out.println("days: "+days);
        System.out.println("seat available: "+seat+"%");
        System.out.println("route type: "+root);
        System.out.println("base price: "+"$"+amount);
        System.out.println("demand: "+mul+"x");
        System.out.println("final price: "+"$"+total);
        System.out.println("category: "+num);
    }
}
