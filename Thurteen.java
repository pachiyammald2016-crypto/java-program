package For;
import java.util.Scanner;
public class Thurteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int eligibleCount = 0;
        int rejectedCount = 0;
        for (int i = 1; i <= n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            double weight = sc.nextDouble();
            double hemoglobin = sc.nextDouble();
            boolean eligible = true;
            String reason = "";
            if (age < 18 || age > 65) {
                eligible = false;
                reason = "Age must be between 18 and 65 years";
            }
            else if (weight < 50) {
                eligible = false;
                reason = "Weight below 50 kg";
            }
            else if (hemoglobin < 12.5) {
                eligible = false;
                reason = "Hemoglobin below 12.5 g/dL";
            }
            if (eligible) {
                eligibleCount++;
            } else {
                rejectedCount++;
            }
            System.out.println("Donor: " + name);
            System.out.println("Age: " + age + " years");
            System.out.println("Weight: " + weight + " kg");
            System.out.println("Hemoglobin: " + hemoglobin + " g/dL");
            if (eligible) {
                System.out.println("Status: Eligible");
            } else {
                System.out.println("Status: Not Eligible");
                System.out.println("Reason: " + reason);
            }
            System.out.println();
        }
        double eligibilityRate = (eligibleCount * 100.0) / n;
        System.out.println("Total Donors: " + n);
        System.out.println("Eligible Donors: " + eligibleCount);
        System.out.println("Rejected Donors: " + rejectedCount);
        System.out.println("Eligibility Rate: " + eligibilityRate + "%");
    }
}
