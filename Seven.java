package String;
import java.util.Scanner;
public class Seven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            String[] num=s.split("-");
            String airline=num[0].substring(0,2);
            String flight=num[0].substring(2);
            String from=num[1];
            String to=num[2];
            System.out.println("Airline: "+airline+", Flight: "+flight+", From: "+from+", To: "+to);                                                                       
        }
    }
}
