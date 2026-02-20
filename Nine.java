package Ifelse;
import java.util.Scanner;
public class Nine {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double annual=sc.nextDouble();
        String business=sc.next();
        double expenses=sc.nextDouble();
        double tax=sc.nextDouble();
        double value=annual-expenses;
        double number=0.0;
        if(business.equals("c-corp")){
        if(value<500000){
            number=21;
        }
        else if(value>500000&&value<=1000000){
            number=24;
        }
        else if(value>1000000&&value<=2000000){
            number=28;
        }
        else if(value>2000000){
            number=30;
        }
        }
        else if(business.equals("S-crop")){
            if(value<500000){
                number=20;
            }
            else if(value>500000&&value<=1000000){
                number=25;
            }
            else if(value>1000000){
                number=28;
            }
        }
        else if(business.equals("llc")){
            if(value<200000){
                number=20;
            }
            else if(value>200000&&value<=500000){
                number=18;
            }
            else if(value>500000){
                number=22;
            }
        }
        else if(business.equals("partnership")){
            if(value<300000){
                number=18;
            }
            else if(value>300000&&value<=800000){
                number=22;
            }
            else if(value>800000){
                number=26;
            }
        }
        double gross=value*(number/100.0);
        double net=gross-tax;
        if(net<0){
            net=0;
        }
        double effective=(net/annual)*100;

        System.out.println("annual revenue: "+"$"+annual);
        System.out.println("business type: "+business);
        System.out.println("expenses: "+"$"+expenses);
        System.out.println("tax credits: "+"$"+tax);
        System.out.println("taxable income: "+"$"+value);
        System.out.println("tax rate: "+number+"%");
        System.out.println("gross tax: "+"$"+gross);
        System.out.println("net tax: "+"$"+net);
        System.out.println("effective tax:%.2f%"+effective+"%");

    }
}
