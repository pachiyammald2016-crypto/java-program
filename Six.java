package For;
import java.util.Scanner;
public class Six {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double initial=sc.nextDouble();
		int n=sc.nextInt();
		double sum=0.0;
		int count=0;
		int count1=0;
		String status="";
		;double add=0.0;
		double amount=0.0;
		for(int i=1;i<=n;i++) {
			double withdraw=sc.nextDouble();
			amount=initial-withdraw;
			if(withdraw<=amount) {
				initial=amount;
				status="approved";
				sum+=amount;
				count++;
				
			}
			else {
				status="denied";
				count1++;
			}
			System.out.println("transaction"+ i+":"+"$"+withdraw);
			add+=withdraw;
			System.out.println("status: "+status);
			if(status.equals("denied")) {
				System.out.println("reason: "+"Insufficient funds");
			}
			System.out.println("remaining balance: "+"$"+"$"+amount);
			System.out.println();
		}
		System.out.println("total transactions: "+n);
		System.out.println("successful withdraw: "+count);
		System.out.println("failed withdraw: "+count1);
		System.out.println("final balance: "+"$"+amount);
		System.out.println("total withdraw: "+"$"+add);
		
	}
}