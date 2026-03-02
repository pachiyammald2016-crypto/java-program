package For;
import java.util.Scanner;
public class Ten {
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double subtotal=0.0;
		int total=0;
		double value=0.0;
		for(int i=1;i<=n;i++) {
			String name=sc.next();
			double price=sc.nextDouble();
			int quantity=sc.nextInt();
			
			subtotal=price*quantity;
			total+=quantity;
			value+=subtotal;
			System.out.println("item: "+name);
			System.out.println("price: "+"$"+price+"x"+quantity);
			System.out.println("subtotal: "+"$"+subtotal);
		}
		double tax=value*0.08;
		double charge=value*0.10;
		double finalvalue=value+tax+charge;
		System.out.println("total items: "+total);
		System.out.println("subtotal: "+value);
		System.out.println("tax(8%): "+tax);
		System.out.println("service charge(10%): "+charge);
		System.out.println("grand total: "+finalvalue);
		
	}
}


