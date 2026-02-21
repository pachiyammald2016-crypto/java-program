package Ifelse;
import java.util.Scanner;
public class Twenteone {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String location=sc.next();
        double parking=sc.nextDouble();
        String vehicle=sc.next();
        String membership=sc.next();

        double baserate=5.00;
        int zonepremium=0;
        if(location.equals("downtown")){
            zonepremium=50;
        }
         if(location.equals("business-district")){
            zonepremium=30;
        }
         if(location.equals("residential")){
            zonepremium=0;
        }
         if(location.equals("airport")){
            zonepremium=100;
        }

        double surcharge=0.0;
        if(vehicle.equals("motorcycle")){
            surcharge=-2;
        }
         if(vehicle.equals("compact")){
            surcharge=0;
        }
         if(vehicle.equals("sedan")){
            surcharge=0;
        }
         if(vehicle.equals("SUV")){
            surcharge=3;
        }
         if(vehicle.equals("oversized")){
            surcharge=5;
        }

      double hourlyRate=baserate+(baserate*zonepremium/100.0)+surcharge;
      double rawfee=hourlyRate*parking;
        int discount=0;
        if(membership.equals("none")){
            discount=0;
        }
        if(membership.equals("monthly")){
            discount=20;
        }
        if(membership.equals("annual")){
            discount=25;
        }
        if(membership.equals("vip")){
            discount=30;
        }
        
        double capAmount = 0;
        double finalfee=0.0;
        String dailycap="";

if(location.equalsIgnoreCase("Downtown")){
    capAmount = 150;
}
else if(location.equalsIgnoreCase("Business-District")){
    capAmount = 120;
}
else if(location.equalsIgnoreCase("Residential")){
    capAmount = 60;
}
else if(location.equalsIgnoreCase("Airport")){
    capAmount = 180;
}
if(parking >= 24){
    dailycap = "Yes";
    if(finalfee > capAmount){
        finalfee = capAmount;
    }
}
else{
    dailycap = "No";
}
        finalfee=rawfee*(1-discount/100.0);
        String category="none";
        if(location.equals("downtown")){
            category="premium";
           }
           if(location.equals("business-district")){
            category="premium";
           }
           if(location.equals("residential")){
             category="standard";
           }
           if(location.equals("airport")){
            category="luxury";
           }

        System.out.println("location zone: "+location);
        System.out.println("parking duration: "+parking+" hours");
        System.out.println("vehicle type: "+vehicle);
        System.out.println("membership status: "+membership);
        System.out.println("base hourly rate: "+"$"+baserate);
        System.out.println("zone premium: "+zonepremium+"%");
        System.out.println("vehicle size surchages: "+"$"+surcharge);
        System.out.println("membership discount: "+discount+"%");
        System.out.println("total parking fee: "+"$"+finalfee);
        System.out.println("daily cap applied: "+dailycap);
        System.out.println("rate cetagory: "+category);

        
    }
}
