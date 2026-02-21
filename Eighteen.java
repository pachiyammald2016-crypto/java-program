package Ifelse;
import java.util.Scanner;
public class Eighteen {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double pack=sc.nextDouble();
    String destination=sc.next();
    String shipping=sc.next();
    String size=sc.next();

    double baserate=0.0;
    if(shipping.equals("economy")){
        baserate=5.0;
    }
    else if(shipping.equals("standard")){
        baserate=10.0;
    }
    else if(shipping.equals("express")){
        baserate=25;
    }
    else if(shipping.equals("overnight")){
        baserate=50;
    }

    double weight=pack*2;
    if(pack<15){
        weight=pack;
    }
    double multiplier=0.0;
    if(destination.equals("local")){
        multiplier=1.0;
    }
     else if(destination.equals("regional")){
        multiplier=1.2;
    }
     else if(destination.equals("national")){
        multiplier=1.5;
    }
     else if(destination.equals("international")){
        multiplier=3.0;
    }

    double add=0.0;
    if(size.equals("small")){
        add=0;
    }
    else if(size.equals("medium")){
        add=5;
    }
    else if(size.equals("large")){
        add=15;
    }
     else if(size.equals("oversized")){
        add=30;
    }

    double basecost=(baserate+weight)*multiplier;
    double totalcost=basecost+add;

    String delivery="none";
    int time=0;
    if(destination.equals("local")&&shipping.equals("economy")){
        delivery="budget";
        time=7;
    }
    if(destination.equals("regional")&&shipping.equals("standard")){
        delivery="standard";
        time=5;
    }
    if(destination.equals("national")&&shipping.equals("express")){
        delivery="priority";
        time=2;
    }
    if(destination.equals("international")&&shipping.equals("overnight")){
        delivery="premium";
        time=1;
    }

    System.out.println("package weight: "+pack+" lbs");
    System.out.println("destination zone: "+destination);
    System.out.println("shipping speed: "+shipping);
    System.out.println("package size: "+size);
    System.out.println("base shipping rate: "+"$"+baserate);
    System.out.println("weight surcharge: "+"$"+weight);
    System.out.println("zone multiplier: "+"$"+multiplier);
    System.out.println("size surcharge: "+"$"+add);
    System.out.println("total shipping cost: "+"$"+totalcost);
    System.out.println("estimated delivery: "+time+" business days");
    System.out.println("service level: "+delivery);


    
   } 
}

