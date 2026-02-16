import java.util.Scanner;
public class Eleven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int del=sc.nextInt();
        int payout=sc.nextInt();
        int incentive=sc.nextInt();
        int fuel=sc.nextInt();
        int num1=del*payout;
        int num2=incentive-fuel;
        int num3=num1+num2;
        System.out.println(num3);
    }
}
