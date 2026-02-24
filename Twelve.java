package Ifelse;
import java.util.Scanner;
public class Twelve {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int driverage=sc.nextInt();
    String vehicletype=sc.next();
    String record=sc.next();
    String coverage=sc.next();
    double basepremium=0;
    if(coverage.equals("basic")){
        basepremium=500.0;
    }
     else if(coverage.equals("standard")){
        basepremium=800.0;
    }
     else if(coverage.equals("comprehensive")){
        basepremium=1500.0;
    }
    double factor=0.0;
    if(driverage>=16&&driverage<=21){
        factor=1.8;
    }
    if(driverage>=22&&driverage<=25){
        factor=1.5;
    }
    if(driverage>=26&&driverage<=40){
        factor=1.0;
    }
    if(driverage>=41&&driverage<=60){
        factor=0.9;
    }
    if(driverage>=61){
        factor=1.1;
    }
    double risk=0.0;
    if(vehicletype.equals("sedan")){
        risk=1.0;
    }
    if(vehicletype.equals("suv")){
        risk=1.2;
    }
    if(vehicletype.equals("sports")){
        risk=1.5;
    }
    if(vehicletype.equals("truck")){
        risk=1.1;
    }
    int adjust=0;
    if(record.equals("clean")){
        adjust=10;
    }
     if(record.equals("minor-violations")){
        adjust=25;
    }
     if(record.equals("major-violations")){
        adjust=50;
    }

    double prem=basepremium*factor*risk;
    double value=prem*(1+adjust/100.0);
    double month=value/12;
     String riskcategory;
        if (factor >= 1.5 ||risk>=1.5||adjust>= 50) {
            riskcategory = "High Risk";
        } else if (factor>= 1.2 ||risk>= 1.2 ||adjust> 0) {
            riskcategory = "Medium Risk";
        } else {
            riskcategory = "Low Risk";
        }

        System.out.println("driver age: "+driverage);
        System.out.println("vehicle type: "+vehicletype);
        System.out.println("driving record: "+record);
        System.out.println("coverage level: "+coverage);
        System.out.println("base premium: "+basepremium);
        System.out.println("age factor: "+factor+"x");
        System.out.println("vehicle risk factor: "+risk+"X");
        System.out.println("record adjustment: "+adjust+"%");
        System.out.println("monthly premium: "+"$"+month);
        System.out.println("annual premium: "+"$"+value);
         System.out.println("risk category: "+riskcategory);

   } 
}

