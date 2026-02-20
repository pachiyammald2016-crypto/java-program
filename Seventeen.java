package Ifelse;
import java.util.Scanner;
public class Seventeen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String cardtier=sc.next();
        String purchase=sc.next();
        double transaction=sc.nextDouble();
        String status=sc.next();

        double basepoint=1.0;
        double bonus=0.0;
        if(purchase.equals("groceries")){
            bonus=2.0;
        }
        if(purchase.equals("dining")){
            bonus=2.5;
        }
        if(purchase.equals("travel")){
            bonus=3.0;
        }
        if(purchase.equals("gas")){
            bonus=2.0;
        }
        if(purchase.equals("other")){
            bonus=1.0;
        }

        double multiplier=0.0;
        if(cardtier.equals("basic")){
            multiplier=1.0;
        }
        if(cardtier.equals("gold")){
            multiplier=1.25;
        }
        if(cardtier.equals("platinum")){
            multiplier=1.5;
        }
        if(cardtier.equals("black")){
            multiplier=2.0;
        }

        double promotion=0.0;
        if(status.equals("none")){
            promotion=1.0;
        }
        if(status.equals("double-points")){
            promotion=2.0;
        }
        if(status.equals("triple-points")){
            promotion=3.0;
        }

        double pointsearned=transaction*basepoint*bonus*multiplier*promotion;
        double cashvalue=pointsearned*0.01;

        String rewards="none";
        if(cardtier.equals("basic")){
            rewards="standard";
        }
        if(cardtier.equals("gold")){
            rewards="enhanced";
        }
        if(cardtier.equals("platinum")){
            rewards="premium";
        }
        if(cardtier.equals("black")){
            rewards="elite";
        }

        System.out.println("card tier: "+cardtier);
        System.out.println("purchase category: "+purchase);
        System.out.println("transaction amount: "+"$"+transaction);
        System.out.println("promotional status: "+status);
        System.out.println("base points rate: "+basepoint+" points per dollar");
        System.out.println("category bonus: "+bonus+"x");
        System.out.println("tier multiplier: "+multiplier+"x");
        System.out.println("promotional multiplier: "+promotion+"x");
        System.out.println("points earned: "+pointsearned);
        System.out.println("equivalent cash value: "+"$"+cashvalue);
        System.out.println("rewards tier: "+rewards);
    }
}
