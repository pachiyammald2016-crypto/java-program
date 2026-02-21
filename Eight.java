package Ifelse;
import java.util.Scanner;
public class Eight {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String location=sc.next();
        int square=sc.nextInt();
        int age=sc.nextInt();
        int score=sc.nextInt();
        String category="";
        double base=0.0;
        int adjust=0;
        int bonus=0;

        if(location.equals("prime")){
            base=400.0;
        }
         else if(location.equals("urban")){
            base=300.0;
        }
         else if(location.equals("suburban")){
            base=180.0;
        }
         else if(location.equals("rural")){
            base=100.0;
        }
        if(age>=0&&age<=5){
            adjust=0;
        }
        else if(age>=6&&age<=15){
           adjust=5;
        }
        else if(age>=16&&age<=30){
            adjust=15;
        }
        else if(age>31){
            adjust=25;
        }

        if(score>=75&&score<=100){
            bonus=10;
        }
        else if(score>=60&&score<80){
            bonus=5;
        }
        else if(score>=40&&score<60){
            bonus=2;
        }
        if(score<40){
            bonus=0;
        }
        if(location.equals("prime")&&age<=15||
        location.equals("urban")&&age<=15){
            category="hot";
        }
        else if(location.equals("suburban")){
            category="stable";
        }
        else if(location.equals("rural")||age>30){
            category="slow";
        }
        double basevalue=square*base;
        double value=basevalue*(adjust/100.0);
        double amenity=basevalue*(bonus/100.0);
        double total=basevalue-value+amenity;
        System.out.println("location tier: "+location);
        System.out.println("square footage: "+square +"sq "+"ft");
        System.out.println("property age: "+age +"years");
        System.out.println("amenity score: "+score);
        System.out.println("base price per sq ft: "+"$"+base);
        System.out.println("age adjustment: "+adjust+"%");
        System.out.println("amenity bonus: "+"$"+basevalue);
        System.out.println("estimated property value: "+"$"+total);
        System.out.println("market category: "+category);

        

        
    }
}

