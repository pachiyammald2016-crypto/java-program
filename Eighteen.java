import java.util.Scanner;
public class Eighteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int hours=sc.nextInt();
        int rate=sc.nextInt();
        int design=sc.nextInt();
        int testing=sc.nextInt();
        int advance=sc.nextInt();
        int num1=hours*rate;
        int num2=num1+design+testing-advance;
        System.out.println(num2);
    }
}
