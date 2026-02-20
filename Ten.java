package Ifelse;
import java.util.Scanner;
public class Ten {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String time=sc.next();
    double power=sc.nextDouble();
    double percent=sc.nextDouble();
    String rate=sc.next();
    double baserate=0.0;
    double multiplier=0.0;
    if(rate.equals("basic")){
        baserate=0.18;
    }
    else if(rate.equals("time-of-use")){
        baserate=0.15;
    }
    else if(rate.equals("premium-green")){
        baserate=0.12;
    }
    if(time.equals("peak")){
        if(rate.equals("basic")){
            multiplier=1.8;
        }
        else{
            multiplier=1.5;
        }
    }
    else if(time.equals("off-peak")){
        if(rate.equals("time-of-use")){
            multiplier=0.8;
        }
        else{
            multiplier=1.0;
        }
    }
    else if(time.equals("super-off-peak")){
        if(rate.equals("premium-green")){
            multiplier=0.6;
        }
        else{
            multiplier=0.5;
        }
    }
    String recommendation="none";
    double credit=(power*percent/100.0)*baserate;
    double cost=(power*baserate*multiplier)-credit;
    if(cost<0){
        cost=0;
    }
    if(time.equals("peak")&&percent<30){
        recommendation="shift to off-peak";
    }
    else if(time.equals("super-off-peak")&&percent>70){
        recommendation="excellent! continue";
    }
    else if(rate.equals("basic")&&time.equals("off-peak")){
        recommendation="upgrade to time-of-peak";
    }
    else{
        recommendation="good timing! consider increasing renewable capacity";
    }
    double offpeak=0.0;
    double potential=0.0;

    if(time.equals("peak")){
        offpeak=(power*baserate*1.0)-credit;
        potential=cost-offpeak;

        if(potential<0){
            potential=0;
        }
    }

    System.out.println("time of day: "+time);
    System.out.println("power consumption: "+power);
    System.out.println("renewable energy: "+percent+"%");
    System.out.println("rate tier: "+rate);
    System.out.println("base tier: "+baserate+"/kwh");
    System.out.println("rate multiplier: "+multiplier+"x");
    System.out.println("renewable credit: "+credit);
    System.out.println("total cost: "+cost);
    System.out.println("optimization: "+recommendation);
    System.out.println("potential savings: "+potential);

    
  }  
}
