import java.util.Scanner;
public class Six {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int total=sc.nextInt();
        int service=sc.nextInt();
        int gst=sc.nextInt();
        int number=sc.nextInt();
        int sum=total+((total*service)/100);
        int num=sum+((sum*gst)/100);
        int divide=num/number;
        System.out.println(divide);
    }
}
