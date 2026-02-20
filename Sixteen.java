package Ifelse;
import java.util.Scanner;
public class Sixteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String room=sc.next();
        String season=sc.next();
        int nightbooked=sc.nextInt();
        String loyalty=sc.next();

        double baserate=0.0;
        if(room.equals("standard")){
            baserate=150;
        }
        if(room.equals("delux")){
            baserate=300;
        }
        if(room.equals("suite")){
            baserate=500;
        }
        if(room.equals("presidential")){
            baserate=1000;
        }

        double multiplier=0.0;
        if(season.equals("off-peak")){
            multiplier=0.7;
        }
         if(season.equals("regular")){
            multiplier=1.0;
        }
         if(season.equals("peak")){
            multiplier=1.5;
        }
         if(season.equals("holiday")){
            multiplier=2.0;
        }

        int staydiscount=0;
        if(nightbooked>=1&&nightbooked<=4){
            staydiscount=0;
        }
        if(nightbooked>=5&&nightbooked<=7){
            staydiscount=5;
        }
        if(nightbooked>=8&&nightbooked<=14){
            staydiscount=10;
        }
        if(nightbooked>=15){
            staydiscount=20;
        }

        int total=0;
        if(loyalty.equals("none")){
            total=0;
        }
         if(loyalty.equals("member")){
            total=10;
        }
         if(loyalty.equals("gold")){
            total=15;
        }
         if(loyalty.equals("platinum")){
            total=20;
        }

        double seasonalrate=baserate*multiplier;
        double discountedrate=seasonalrate*(1-staydiscount/100.0)*(1-total/100.0);
        double totalcost=discountedrate*nightbooked;

        String upgrades="none";
        if(room.equals("delux")&&loyalty.equals("none")){
            upgrades="none";
        }
        if(room.equals("suite")&&loyalty.equals("member")){
            upgrades="free breakfast";
        }
        if(room.equals("presidential")&&loyalty.equals("platinum")){
            upgrades="concierge service,airport transfer,and fine";
        }
        if(room.equals("standard")&&loyalty.equals("none")){
            upgrades="none";
        }
        if(room.equals("delux")&&loyalty.equals("gold")){
            upgrades="free breakfast and spa access";
        }

        System.out.println("room category: "+room);
        System.out.println("season: "+season);
        System.out.println("nights booked: "+nightbooked);
        System.out.println("loyalty tier: "+loyalty);
        System.out.println("base rate per night: "+"$"+baserate);
        System.out.println("seasonal multiplier: "+multiplier+"x");
        System.out.println("extended stay discount: "+staydiscount+"%");
        System.out.println("loyalty discount: "+total+"%");
        System.out.println("nightly rate: "+"$"+discountedrate);
        System.out.println("total booking cost: "+"$"+totalcost);
        System.out.println("complimentary upgrades: "+upgrades);


        
    }
}
