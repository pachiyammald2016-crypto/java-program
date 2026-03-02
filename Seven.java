package For;
import java.util.Scanner;
public class Seven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double price=0.0;
		double total=0.0;
		int consumed=0;
		String category="";
		for(int i=0;i<=n;i++) {
			String customer=sc.next();
			int units=sc.nextInt();
			
			if(units>0&&units<=100) {
				price=(units*0.10);
			}
			else if(units>=101&&units<=200) {
				price=((units-100)*0.13)+(100*0.10);
			}
			else if(units>=201&&units<=300) {
				price=(100*0.10)+((units-200)*0.16)+((units-100)*0.13);
			}
			else {
				price=(100*0.10)+((units-200)*0.16)+((units-100)*0.13)+((units-300)*0.20);
			}
			total+=price;
			consumed+=units;
			if(units<=200) {
				category="low";
			}
			else if(units>200&&units<=300) {
				category="medium";
			}
			else if(units>300) {
				category="high";
			}
			System.out.println("consumer ID: "+customer);
			System.out.println("units consumed: "+units);
			System.out.println("bill amount: "+"$"+price);
			System.out.println("category: "+category);
		}
		double revenue=total/n;
		System.out.println("total consumers: "+n);
		System.out.println("total units consumed: "+consumed);
		System.out.println("total revenue: "+total);
		System.out.println("average bill: "+revenue);
		
	}
} 

