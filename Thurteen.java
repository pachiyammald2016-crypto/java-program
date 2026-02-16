import java.util.Scanner;
public class Thurteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ticket=sc.nextInt();
        int snack=sc.nextInt();
        int maintanance=sc.nextInt();
        int electricity=sc.nextInt();
        int num1=ticket+snack-maintanance-electricity;
        System.out.println(num1);
    }
}
