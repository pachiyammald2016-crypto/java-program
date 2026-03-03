package For;
import java.util.Scanner;
public class Seventeen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int discount=0;
        String priority="";
        int count=0;
        double total=0.0;

        for(int i=1;i<=n;i++){
            String name=sc.next();
            String type=sc.next();
            int days=sc.nextInt();
            double fee=0.0;
            if(type.equals("basic")){
                fee=50;
            }
            else if(type.equals("premium")){
                fee=100;
            }
            else if(type.equals("VIP")){
                fee=200;
            }

            if(days>=45){
                discount=20;
            }
            else if(days>=30&&days<=44){
                discount=15;
            }
            else if(days>=15&&days<=29){
                discount=10;
            }
            else if(days<15){
                discount=0;
            }

            if(days<10){
                priority="urgent";
                count++;
            }
            else if(days>=10&&days<=30){
                priority="high";
            }
            else if(days>30){
                priority="normal";
            }

            double finalfee=fee*(1-discount/100.0);
            total+=finalfee;
        }
        
    }
    
}
