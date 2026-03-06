package While;
import java.util.Scanner;
public class Tone {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=0;
        int i=1;
        do{
            sum=n*i;
            System.out.println(n+" x "+i+" = "+sum);
            i++;
        }
        while(i<=m);
    }
}
