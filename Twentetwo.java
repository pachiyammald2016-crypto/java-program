import java.util.Scanner;
public class Twentetwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int main=sc.nextInt();
        int park=sc.nextInt();
        int hall=sc.nextInt();
        int secure=sc.nextInt();
        int electricity=sc.nextInt();
        int clean=sc.nextInt();
        int num1=main+park+hall-secure-electricity-clean;
        System.out.println(num1);
    }
}
