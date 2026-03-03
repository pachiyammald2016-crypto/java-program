package For;
import java.util.Scanner;
public class Ninteen{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        int count1=0;
        int count2=0;
        int count3=0;
    for(int i=0;i<n;i++){
        String id=sc.next();
        String type=sc.next();
        int month=sc.nextInt();

        int waranty=0;
        int remaining=0;
        String status="";
        if(type.equals("electronics")){
            waranty=12;
        }
        else if(type.equals("appliance")){
            waranty=24;
        }
        else if(type.equals("computer")){
            waranty=36;
        }
        remaining=waranty-month;
        if(remaining==0){
            status="expired";
            count1++;
        }
        else if(remaining>=1&&remaining<=3){
            status="expired soon";
            count2++;
        }
        if(remaining>3){
            status="active";
            count3++;
        }

        System.out.println("product ID: "+id);
        System.out.println("type: "+type);
        System.out.println("warrenty period: "+waranty);
        System.out.println("months used: "+month);
        System.out.println("remaining: "+remaining);
        System.out.println("status: "+status);
    }

    System.out.println("total products: "+n);
    System.out.println("active warrenties: "+count3);
    System.out.println("expiring warenty: "+count2);
    System.out.println("expired warrenties: "+count1);
}
}
