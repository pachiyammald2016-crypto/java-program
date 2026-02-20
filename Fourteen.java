package Ifelse;
import java.util.Scanner;
public class Fourteen {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String membership=sc.next();
    int contract=sc.nextInt();
    String accesslevel=sc.next();
    String addons=sc.next();

    double base=0.0;
    if(membership.equals("basic")){
        base=40.0;
    }
     if(membership.equals("premium")){
        base=80.0;
    }
     if(membership.equals("elite")){
        base=120.0;
    }
     if(membership.equals("vip")){
        base=150.0;
    }
    int discount=0;
    if(contract==1){
        discount=0;
    }
    if(contract==6){
        discount=10;
    }
    if(contract==12){
        discount=15;
    }
    if(contract==24){
        discount=25;
    }
    double fee=0.0;
    if(accesslevel.equals("single-location")){
        fee=0.0;
    }
    if(accesslevel.equals("regional")){
        fee=20.0;
    }
    if(accesslevel.equals("nationwide")){
        fee=50.0;
    }
    double nonfee=0.0;
    if(addons.equals("none")){
        nonfee=0.0;
    }
     if(addons.equals("personal-training")){
        nonfee=100.0;
    }
     if(addons.equals("classes")){
        nonfee=50.0;
    }
     if(addons.equals("full package")){
        nonfee=200.0;
    }

    double discountedbase=base*(1-discount/100.0);
    double monthly=discountedbase+fee+nonfee;
    double contracttotal=monthly*contract;
    double savings=(base+fee+nonfee)*contract-contracttotal;
    String category;
        if (membership.equals("vip") || monthly>=200) {
            category = "luxury";
        } else if (membership.equals("elite")||monthly>=120) {
            category = "premium";
        } else {
            category = "standard";
        } 

        System.out.println("membership tier: "+membership);
        System.out.println("contract length: "+contract);
        System.out.println("access level: "+accesslevel);
        System.out.println("odd-ons: "+addons);
        System.out.println("base monthly fee: "+"$"+base);
        System.out.println("contract discount: "+discount+"%");
        System.out.println("access fee: "+"$"+fee);
        System.out.println("add-on fee"+"$"+"$"+nonfee);
        System.out.println("monthly total: "+"$"+monthly);
        System.out.println("contract fee: "+"$"+contracttotal);
        System.out.println("savings: "+"$"+savings);
        System.out.println("membership category: "+category);


   } 
}
