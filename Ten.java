import java.util.Scanner;
public class Ten {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int roomcharge=sc.nextInt();
        int days=sc.nextInt();
        int medicine=sc.nextInt();
        int labfees=sc.nextInt();
        int insurance=sc.nextInt();
        int num1=roomcharge*days;
        int num2=num1+medicine;
        int num3=num2+(labfees-insurance);
        System.out.println(num3);
    }
}
