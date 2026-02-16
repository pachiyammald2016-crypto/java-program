import java.util.Scanner;
public class Fifteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int sessions=sc.nextInt();
        int pay=sc.nextInt();
        int bonus=sc.nextInt();
        int maintanance=sc.nextInt();
        int num1=base+(sessions*pay);
        int num2=bonus-maintanance;
        int num3=num1+num2;
        System.out.println(num3);
    }
}
