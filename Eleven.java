package For;
import java.util.Scanner;
public class Eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double originalTotal = 0.0;
        double totalDiscount = 0.0;
        double finalTotal = 0.0;
        for (int i = 1; i <= n; i++) {
            String seattype = sc.next();
            String customer = sc.next();
            double price = 0.0;
            double discountPercent = 0.0;
            if (seattype.equalsIgnoreCase("Regular")) {
                price = 12.0;
            } 
            else if (seattype.equalsIgnoreCase("Premium")) {
                price = 18.0;
            } 
            else if (seattype.equalsIgnoreCase("Recliner")) {
                price = 25.0;
            }
            if (customer.equalsIgnoreCase("Adult")) {
                discountPercent = 0.0;
            } 
            else if (customer.equalsIgnoreCase("Child")) {
                discountPercent = 30.0;
            } 
            else if (customer.equalsIgnoreCase("Senior")) {
                discountPercent = 25.0;
            }
            double discountAmount = price * discountPercent / 100;
            double finalPrice = price - discountAmount;
            originalTotal += price;
            totalDiscount += discountAmount;
            finalTotal += finalPrice;
            System.out.println("Ticket " + i + ": " + seattype + " - " + customer);
            System.out.println("Base Price: $" + price);
            System.out.println("Discount: " + (int)discountPercent + "%");
            System.out.println("Final Price: $" + finalPrice);
            System.out.println();
        }
        boolean groupDiscountApplied = false;
        if (n >= 5) {
            groupDiscountApplied = true;
            double groupDiscount = finalTotal * 0.10;
            finalTotal -= groupDiscount;
        }
        System.out.println("Total Tickets: " + n);
        System.out.println("Original Total: $" + originalTotal);
        System.out.println("Total Discount: $" + totalDiscount);
        System.out.println("Final Total: $" + finalTotal);
        System.out.println("Group Discount Applied: " + (groupDiscountApplied ? "Yes" : "No"));
    }
}