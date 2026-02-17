import java.util.Scanner;
public class Twentee {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int rent=sc.nextInt();
        int late=sc.nextInt();
        int fuel=sc.nextInt();
        int maintenance=sc.nextInt();
        int num1=days*rent;
        int num2=num1+late;
        int num3=num2-fuel-maintenance;
        System.out.println(num3);
    }
}
