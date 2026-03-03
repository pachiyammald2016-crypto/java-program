package For;
import java.util.Scanner;
public class Sixteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double fee=0.0;
        double discount=0.0;
        String num="";
        double finalfee=0.0;
        int count=0;
        double sum=0.0;
        for(int i=0;i<n;i++){
            String name=sc.next();
            String type=sc.next();
            int expiry=sc.nextInt();

            if(type.equals("basic")){
                fee=50;
            }
            else if(type.equals("premium")){
                fee=100;
            } 
            else if(type.equals("VIP")){
                fee=200;
            }

            if(expiry>=45){
                discount=20;
            }
            else if(expiry>=30&&expiry<=44){
                discount=15;
            }
            else if(expiry>=15&&expiry<=29){
                discount=10;
            }
            else if(expiry<15){
                discount=0;
            }

            if(expiry<10){
                num="urgent";
                count++;
            }
            else if(expiry>10&&expiry<=30){
                num="high";
            }
            else if(expiry>30){
                num="normal";
            }
            finalfee=fee*(1-discount/100.0);
            sum+=finalfee;
            System.out.println("member: "+name);
            System.out.println("membership: "+type);
            System.out.println("days expiry: "+expiry);
            System.out.println("renewal fee: "+fee);
            System.out.println("discount: "+discount);
            System.out.println("final fee: "+finalfee);
            System.out.println("priority: "+num);

        }
        double avg=sum/n;
         
        System.out.println("total members: "+n);
        System.out.println("urgent renewals: "+count);
        System.out.println("total renewal revenue: "+sum);
        System.out.println("average renewal fee: "+avg);

    }
}
