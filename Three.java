package Ifelse;
import java.util.Scanner;
public class Three {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        String smoke=sc.next();
        String condition=sc.next();
        String cover=sc.next();
        String first="basic";
        String second="standard";
        String third="premium";
        double base=0.0;
        double risk=0.0;
        if(age>=18&&age<=30){
            if(cover.equals(first)){
                base=200;
            }
            else if(cover.equals(second)){
                base=300;
            }
            else if(cover.equals(third)){
                base=500;
            }
        }
        else if(age>30&&age<51){
            if(cover.equals(first)){
                base=250;
            }
            else if(cover.equals(second)){
                base=350;
            }
            else if(cover.equals(third)){
                base=600;
            }
        }
        else if(age>50&&age<=65){
            if(cover.equals(first)){
                base=350;
            }
            else if(cover.equals(second)){
                base=450;
            }
            else if(cover.equals(third)){
                base=700;
            }
        }
        else{
            if(cover.equals(first)){
                base=400;
            }
            else if(cover.equals(second)){
                base=550;
            }
            else if(cover.equals(third)){
                base=800;
            }
        }
        if(smoke.equalsIgnoreCase("smoke")){
            if(condition.equals("yes")){
                risk= base *0.70;
            }
            else{
                risk=base *0.40;
            }
        }
        else{
            if(condition.equals("yes")){
                risk=base *0.30;
            }
            else{
                risk=0;
            }
        }
        double total =base+risk;

        System.out.println("Age: "+age);
        System.out.println("Smoking Status: "+smoke);
        System.out.println("Condition: "+condition);
        System.out.println("Coverage tier: "+cover);
        System.out.println("Base premium: "+base);
        System.out.println("Risk Surcharge: "+risk);
        System.out.println("Total: "+total);
    }
}
