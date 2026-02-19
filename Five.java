package Ifelse;
import java.util.Scanner;
public class Five {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double gpa=sc.nextDouble();
        double income=sc.nextDouble();
        int extra=sc.nextInt();
        String scolarship=sc.next();
        String num1;
        String category="none";
        String category1="full";
        String category2="partial";
        String category3="minimal";

        double amount=0.0;
        if(gpa>=2.5){
            num1="eligible";

            if(scolarship.equals("merit")){
                if(gpa>=3.8&&extra>=80){
                    category=category1;
                    amount=25000.0;
                }
                else if(gpa>=3.5&&gpa<3.8&&extra>=70&&extra<80){
                    category=category2;
                    amount=15000.0;
                }
                else if(gpa>=3.0&&gpa<3.5&&extra>=60&&extra<70){
                    category=category3;
                    amount=8000.0;
                }
            }
            else if(scolarship.equals("need")){
                if(income<=30000.0&&gpa>=3.5){
                    category=category1;
                    amount=30000.0;
                }
                else if(income<=50000.0&&gpa>=3.0){
                    category=category2;
                    amount=18000.0;
                }
                else if(income<50000.0&&gpa>=2.8){
                    category=category3;
                    amount=10000.0;
                }
            }
            else if(scolarship.equals("sports")){
                if(extra>=85&&gpa>=3.0){
                    category=category1;
                    amount=22000.0;
                }
                else if(extra>=75&&extra<85&&gpa>=2.8&&gpa<3.0){
                    category=category2;
                    amount=20000.0;
                }
                else if(extra>=65&&extra<75&&gpa>=2.5&&gpa<2.8){
                    category=category3;
                    amount=12000.0;
                }
            }
        }
        else{
            num1="not eligible";
            amount=0;
            category="none";
        }
        System.out.println("gpa: "+gpa);
        System.out.println("family income: "+income);
        System.out.println("extracuricular: "+extra);
        System.out.println("scolarship: "+scolarship);
        System.out.println("eligibility: "+num1);
        System.out.println("amount: "+"$"+amount);
        System.out.println("category: "+category);
    }
}
