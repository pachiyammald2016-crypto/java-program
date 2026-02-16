import java.util.Scanner;
public class Twelve {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int distance=sc.nextInt();
        int rate=sc.nextInt();
        int maintenence=sc.nextInt();
        int allowance=sc.nextInt();
        int subsidy=sc.nextInt();
        int num1=(distance*rate)+maintenence+(allowance-subsidy);
        System.out.println(num1);
    }
}
