import java.util.Scanner;
public class Twenteone {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ads=sc.nextInt();
        int spon=sc.nextInt();
        int aff=sc.nextInt();
        int tax=sc.nextInt();
        int prod=sc.nextInt();
        int num1=ads+spon+aff-tax-prod;
        System.out.println(num1);

    }
}
