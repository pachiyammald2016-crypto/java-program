import java.util.Scanner;
public class Sixteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int room=sc.nextInt();
        int price=sc.nextInt();
        int service=sc.nextInt();
        int commision=sc.nextInt();
        int num1=room*price;
        int num2=num1+service;
        int num3=num2-commision;
        System.out.println(num3);
    }
}
