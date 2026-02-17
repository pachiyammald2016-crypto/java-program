import java.util.Scanner;
public class Twentefive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int reg=sc.nextInt();
        int broad=sc.nextInt();
        int spon=sc.nextInt();
        int prize=sc.nextInt();
        int rent=sc.nextInt();
        int ad=sc.nextInt();
        int num1=reg+broad+spon-prize-rent-ad;
        System.out.println(num1);

    }
}
