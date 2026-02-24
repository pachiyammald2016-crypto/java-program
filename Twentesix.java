import java.util.Scanner;
public class Twentesix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int res=sc.nextInt();
        int rate=sc.nextInt();
        int com=sc.nextInt();
        int c=sc.nextInt();
        int con=sc.nextInt();
        int pen=sc.nextInt();
        int main=sc.nextInt();
        int treat=sc.nextInt();
        int num1=res*rate;
        int num2=num1+(com*c);
        int num3=num2+con+pen;
        int num4=num3-main;
        int num5=num4-treat;
        System.out.println(num5);
    }
}

