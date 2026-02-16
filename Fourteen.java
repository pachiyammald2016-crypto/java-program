import java.util.Scanner;
public class Fourteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int yield=sc.nextInt();
        int acres=sc.nextInt();
        int extra=sc.nextInt();
        int damage=sc.nextInt();
        int num1=yield*acres;
        int num2=num1+extra;
        int num3=num2-damage;
        System.out.println(num3);
    }
}
