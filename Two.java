package Ifelse;
import java.util.Scanner;
public class Two{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int creditScore = sc.nextInt();
        double annualIncome = sc.nextDouble();
        double debtRatio = sc.nextDouble();
        sc.nextLine(); 
        String loanType = sc.nextLine();
        String decision = "Rejected";
        double maxLoanAmount = 0.0;
        if (creditScore < 600 || debtRatio > 50){
        decision = "Rejected";
        maxLoanAmount = 0.0;
        } 
        else{
            if (creditScore >= 750) {
                if (debtRatio <= 30) {
                    if (loanType.equals("Home")) {
                        decision = "Approved";
                        maxLoanAmount = annualIncome * 4;
                    }
                    else if (loanType.equals("Personal")) {
                        decision = "Approved";
                        maxLoanAmount = annualIncome * 1;
                    }
                    else if (loanType.equals("Business")) {
                        decision = "Approved";
                        maxLoanAmount = annualIncome * 3;
                    }
                } else {
                decision = "Needs Review";
                }
            } 
            else if (creditScore >= 700) {
                if (debtRatio <= 30) {
                    if (loanType.equals("Business") || loanType.equals("Home")) {
                        decision = "Approved";
                        maxLoanAmount = annualIncome * 3;
                    }
                } 
                else if (debtRatio <= 40) {
                    if (loanType.equals("Home")) {
                        decision = "Needs Review";
                        maxLoanAmount = annualIncome * 3;
                    } 
                    else if (loanType.equals("Business")) {
                        decision = "Approved";
                        maxLoanAmount = annualIncome * 3;
                    } 
                    else {
                        decision = "Needs Review";
                    }
                } 
                else {
                    decision = "Needs Review";
                }
            } 
            else if (creditScore >= 650) {
                if (debtRatio <= 40) {
                    if (loanType.equals("Personal")) {
                    decision = "Needs Review";
                    maxLoanAmount = annualIncome * 0.5;
                    } 
                    else {
                    decision = "Needs Review";
                    }
                } 
                else {
                decision = "Rejected";
                }
            } 
            else {
            decision = "Rejected";
            }
        }
        System.out.println("Credit Score: " + creditScore);
        System.out.println("Annual Income: $" + annualIncome);
        System.out.println("Debt-to-Income Ratio: " + debtRatio + "%");
        System.out.println("Loan Type: " + loanType);
        System.out.println("Decision: " + decision);
        System.out.println("Maximum Loan Amount: $" + maxLoanAmount);
    }
}
