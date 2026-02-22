package Ifelse;
import java.util.Scanner;
public class Fifteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int usercount=sc.nextInt();
        String license=sc.next();
        String support=sc.next();
        int contract=sc.nextInt();

        double base=0.0;
        if(license.equals("standard")){
            base=60;
        }
         if(license.equals("professional")){
            base=120;
        }
         if(license.equals("enterprice")){
            base=200;
        }

        int discount=0;
        if(usercount>=1&&usercount<=50){
            discount=0;
        }
         if(usercount>=51&&usercount<=200){
            discount=15;
        }
         if(usercount>=201&&usercount<=500){
            discount=20;
        }
         if(usercount>=501&&usercount<=1000){
            discount=25;
        }
         if(usercount>=1001){
            discount=35;
        }
        double fee=0.0;
        if(support.equals("basic")){
            fee=10;
        }
        if(support.equals("priority")){
            fee=30;
        }
        if(support.equals("premium")){
            fee=80;
        }
        int fees=0;
        if(contract==1){
            fees=0;
        }
        if(contract==2){
            fees=5;
        }
        if(contract==3){
            fees=10;
        }
        if(contract==5){
            fees=20;
        }

        double price=base*(1-discount/100.0);
        double annual =(price+fee)*(1-fees/100.0);
        double totalannual=annual*usercount;
        double contractvalue=totalannual*contract;

        String pricing="none";
        if(usercount<200){
            pricing="small business";
        }
        else if(usercount<=1000){
            pricing="mid-market";
        }
        else{
            pricing="enterprice";
        }

        System.out.println("user count: "+usercount);
        System.out.println("license typr: "+license);
        System.out.println("support level: "+support);
        System.out.println("contract duration: "+contract);
        System.out.println("base price per user: "+"$"+base);
        System.out.println("volume discount: "+discount+"%");
        System.out.println("support fee: "+"$"+fee);
        System.out.println("multi-year discount: "+fees+"%");
        System.out.println("annual cost: "+"$"+annual);
        System.out.println("total annual: "+"$"+totalannual);
        System.out.println("total contract value: "+"$"+contractvalue);
         System.out.println("pricing tier: "+pricing);



    }
}

