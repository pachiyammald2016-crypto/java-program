import java.util.Scanner;
public class Seven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int distance=sc.nextInt();
        int mileage=sc.nextInt();
        int fuel=sc.nextInt();
        int tollcharge=sc.nextInt();
        int sum=distance/mileage;
        int number=sum*fuel;
        int sum2=number+tollcharge;
        System.out.println(sum2);
    }
}
