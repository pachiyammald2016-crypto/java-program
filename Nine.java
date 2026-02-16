import java.util.Scanner;
public class Nine {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rodsperhour=sc.nextInt();
        int hoursworked=sc.nextInt();
        int overtime=sc.nextInt();
        int reject=sc.nextInt();
        int num=rodsperhour*hoursworked;
        int num2=num+overtime;
        int num3=num2-reject;
        System.out.println(num3);
    }
}
