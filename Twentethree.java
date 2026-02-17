import java.util.Scanner;
public class Twentethree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int copy=sc.nextInt();
        int cost=sc.nextInt();
        int edit=sc.nextInt();
        int design=sc.nextInt();
        int com=sc.nextInt();
        int mark=sc.nextInt();
        int num1=copy*cost;
        int num2=num1+edit+design-com-mark;
        System.out.println(num2);
    }
}
