import java.util.Scanner;
public class Five {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tuition=sc.nextInt();
        int scolar=sc.nextInt();
        int exam=sc.nextInt();
        int library=sc.nextInt();
        int sum=tuition-((tuition*scolar)/100);
        int total=sum+exam+library;
        System.out.println(total);

    }
}
