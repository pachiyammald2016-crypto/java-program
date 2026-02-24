package Ifelse;
import java.util.Scanner;
public class Twentetwo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        sc.nextLine();
        String customerType = sc.nextLine();
        String season = sc.nextLine();
        String paymentMethod = sc.nextLine();
        double tier1Rate = 0, tier2Rate = 0, tier3Rate = 0, tier4Rate = 0;
        if (customerType.equalsIgnoreCase("Residential")) {
            tier1Rate = 0.10;
            tier2Rate = 0.15;
            tier3Rate = 0.25;
            tier4Rate = 0.30;
        } 
        else if (customerType.equalsIgnoreCase("Commercial")) {
            tier1Rate = 0.12;
            tier2Rate = 0.18;
            tier3Rate = 0.25;
            tier4Rate = 0.25;
        } 
        else if (customerType.equalsIgnoreCase("Industrial")) {
            tier1Rate = 0.08;
            tier2Rate = 0.12;
            tier3Rate = 0.20;
            tier4Rate = 0.20;
        }
        double tier1Cost = 0, tier2Cost = 0, tier3Cost = 0, tier4Cost = 0;
        if (units > 0) {
            if (units <= 100) {
            tier1Cost = units * tier1Rate;
            } else {
                tier1Cost = 100 * tier1Rate;
                if (units <= 300) {
                tier2Cost = (units - 100) * tier2Rate;
            } else {
                tier2Cost = 200 * tier2Rate;
                if (units <= 500) {
                    tier3Cost = (units - 300) * tier3Rate;
            } else {
                tier3Cost = 200 * tier3Rate;
                tier4Cost = (units - 500) * tier4Rate;
                    }
                }
            }
        }
        double subtotal = tier1Cost + tier2Cost + tier3Cost + tier4Cost;
        int seasonalPercent = 0;
        if (season.equalsIgnoreCase("Summer")) {
            seasonalPercent = 15;
        } 
        else if (season.equalsIgnoreCase("Winter")) {
            seasonalPercent = -10;
        } 
        else {
            seasonalPercent = 0;
        }

        double seasonalAdjusted = subtotal * (1 + seasonalPercent / 100.0);
        int paymentPercent = 0;
        if (paymentMethod.equalsIgnoreCase("Auto-Pay")) {
            paymentPercent = 5;
        } 
        else if (paymentMethod.equalsIgnoreCase("Online")) {
            paymentPercent = 3;
        } 
        else {
            paymentPercent = 0;
        }
        double totalBill = seasonalAdjusted * (1-paymentPercent/100.0);
        double averageRate = 0;
        if (units > 0) {
            averageRate = totalBill/units;
        }
        System.out.println("Units Consumed: " + units + " kWh");
        System.out.println("Customer Type: " + customerType);
        System.out.println("Season: " + season);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Tier 1 Cost (0-100): $" + tier1Cost);
        System.out.println("Tier 2 Cost (101-300): $" + tier2Cost);
        System.out.println("Tier 3 Cost (301-500): $" + tier3Cost);
        System.out.println("Tier 4 Cost (501+): $" + tier4Cost);
        System.out.println("Seasonal Adjustment: " + seasonalPercent + "%");
        System.out.println("Payment Discount: " + paymentPercent + "%");
        System.out.println("Total Bill: $" + totalBill);
        System.out.println("Average Rate: $" +averageRate + "/kWh");
    }

}
