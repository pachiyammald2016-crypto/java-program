package Ifelse;
import java.util.Scanner;
public class One {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int perform=sc.nextInt();
        int years=sc.nextInt();
        String depart=sc.next();
        double base=sc.nextDouble();
        int percent=0;
        String first="critical";
        String second="not critical";
        double bonus=0.0;
         System.out.println("Performance rating:" +perform+"%");
        System.out.println("Years of service:" +years);
        System.out.println("Department:" +depart);
        if(perform<3){
            percent=0;
            System.out.println("percentage: "+0+"%");
        }
        if(perform>=3&&perform<=5){
            if(depart.equals(first)){
                if(perform==5&&years>=5){
                    percent=25;
                    System.out.println("percentage:" +percent+"%");
                    bonus=base*percent/100;
                      System.out.println("Bonus amount:"+"$"+bonus);
                }
                if(perform==4&&years>=10){
                    percent=22;
                     System.out.println("percentage:" +percent+"%");
                      bonus=base*percent/100;
                      System.out.println("Bonus amount:"+"$"+bonus);
                }
                if(perform==4&&years==0){
                    percent=15;
                     System.out.println("percentage:" +percent+"%");
                     bonus=base*percent/100;
                       System.out.println("Bonus amount:"+"$"+bonus);
                }
                if(perform==3){
                    percent=10;
                     System.out.println("percentage:" +percent+"%");
                     bonus=base*percent/100;
                       System.out.println("Bonus amount:"+"$"+bonus);
                }
            }
            if(depart.equals(second)){
                if(perform==5){
                    percent=18;
                     System.out.println("percentage:" +percent+"%");
                     bonus=base*percent/100;
                      System.out.println("Bonus amount:"+"$"+bonus);
                }
                if(perform==4){
                    percent=12;
                     System.out.println("percentage:" +percent+"%");
                     bonus=base*percent/100;
                      System.out.println("Bonus amount:"+"$"+bonus);
                }
                if(perform==3){
                    percent=8;
                     System.out.println("percentage:" +percent+"%");
                     bonus=base*percent/100;
                      System.out.println("Bonus amount:"+"$"+bonus);
                }
            }
        }
        if(bonus>0){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}

