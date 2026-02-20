package Ifelse;
import java.util.Scanner;
public class Eleven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String order=sc.next();
        String loyalty=sc.next();
        double value=sc.nextDouble();
        String time=sc.next();
        int base=0;
        if(loyalty.equals("gold")){
            base=15;
        }
        else if(loyalty.equals("silver")){
            base=10;
        }
        else if(loyalty.equals("bronze")){
            base=5;
        }
        else if(loyalty.equals("none")){
            base=0;
        }
        int adjust=0;
        if(time.equals("peak")){
            adjust=0;
        }
        else if(time.equals("regular")){
            adjust=0;
        }
        else if(time.equals("late-night")){
            adjust=5;
        }
        double sum=adjust+base;
        double number=0;
        if(order.equals("delivery")){
            number=value*0.10;
        }
        else if(order.equals("takeout")){
            number=value*0.03;
        }
        else if(order.equals("dine-in")){
            number=value*0.0;
        }

        double discount=value*(1-sum/100.0);
        double amount=discount+number;
        String sum2="none";
        if(time.equals("peak")&&order.equals("delivery")){
            sum2="high";
        }
        else if(time.equals("regular")){
            sum2="medium";
        }
        else if(time.equals("late-night")){
            sum2="low";
        }
        int prep=0;
        if (order.equalsIgnoreCase("delivery")) {
            if (sum2.equals("high"))
            prep=40;
            else if (sum2.equals("medium"))
            prep=30;
            else
            prep=25;
        }
        else if (order.equalsIgnoreCase("takeout")) {
            if (sum2.equals("high"))
                prep=30;
            else if (sum2.equals("medium"))
                prep=20;
            else
                prep=15;
        }
        else if(order.equals("dine-in")){
            if (sum2.equals("high"))
                prep=35;
            else if (sum2.equals("medium"))
                prep=25;
            else {
                prep=20;
            }
        }

        System.out.println("order type: "+order);
        System.out.println("loyalty: "+loyalty);
        System.out.println("Order value: "+value);
        System.out.printf("time slot: "+time);
        System.out.println("base discount: " +base+ "%");
        System.out.println("time-based adjustment: "+adjust);
        System.out.printf("Service Fee: $%.2f\n",number);
        System.out.printf("Final Amount: $%.2f\n",amount);
        System.out.println("Kitchen Priority: " + sum2);
        System.out.println("Estimated Preparation Time: "+prep+" minutes");


    }
}
