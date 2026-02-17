import java.util.Scanner;
public class Seventeen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int genpass=sc.nextInt();
        int genfare=sc.nextInt();
        int acpass=sc.nextInt();
        int acfare=sc.nextInt();
        int platform=sc.nextInt();
        int maintanance=sc.nextInt();
        int fuel=sc.nextInt();
        int num1=genpass*genfare;
        int num2=num1+(acpass*acfare);
        int num3=num2+platform;
        int num4=num3-maintanance-fuel;
        System.out.println(num4);
    }
}
