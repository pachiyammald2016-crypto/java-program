import java.util.Scanner;
public class Twentefour {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int weight=sc.nextInt();
        int rate=sc.nextInt();
        int pri=sc.nextInt();
        int insurance=sc.nextInt();
        int hand=sc.nextInt();
        int fuel=sc.nextInt();
        int num1=weight*rate;
        int num2=num1+pri+insurance-hand-fuel;
        System.out.println(num2);
    }
}

