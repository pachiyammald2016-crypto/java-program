package For;
import java.util.Scanner;
public class Twente {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double number=0.0;
        double total=0.0;
        double n1=0.0;
        double n2=0.0;
        double n3=0.0;
        for(int i=1;i<=n;i++){
            String type=sc.next();
            double amount=sc.nextDouble();
            String category="";
            if(type.equals("deposit")){
                category="credit";
            }
            else if(type.equals("withdrawal")){
                category="debit";
                n1+=amount;
            }
            else if(type.equals("transfer")){
                category="debit";
                n2+=amount;
            }
            n3=n1+n2;
            number+=amount;
            System.out.println("transaction: "+" "+i+":"+type);
            System.out.println("amount: "+"$"+amount);
            System.out.println("category: "+category);
        }

         total=(number-(n1+n2+n3));

        System.out.println("total transactions: "+n);
        System.out.println("total deposits: "+"$"+number);
        System.out.println("total withdrawals: "+"$"+n1);
        System.out.println("total transfers: "+"$"+n2);
        System.out.println("total payments: "+"$"+n3);
        System.out.println("net balance change: "+"$"+total);
    }
}
