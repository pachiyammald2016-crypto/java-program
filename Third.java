import java.util.Scanner;
public class Third {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int extra=sc.nextInt();
        int rate=sc.nextInt();
        int tax=sc.nextInt();
        float total=base+(extra*rate);
        float last=total+(tax/100.0f);
        System.out.println(last);

    }
}