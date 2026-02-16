import java.util.Scanner;
public class Eight {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int dayworked=sc.nextInt();
        int wageperday=sc.nextInt();
        int overtime=sc.nextInt();
        int maintenance=sc.nextInt();
        int num=dayworked*wageperday;
        int num2=num+overtime;
        int num3=num2-maintenance;
        System.out.println(num3);
    }
}
