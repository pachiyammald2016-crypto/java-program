package Nestf;
import java.util.Scanner;
public class Four {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        double avg=0;
        System.out.println("grade sheet:");
        System.out.print("Students ");
        for(int k=1;k<=m;k++){
            System.out.print("sub:"+k+" ");
        }
        System.out.println("Average");
        for(int i=1;i<=n;i++){
            String name=sc.next();
            System.out.print(name+" ");
            int sum=0;
            for(int j=1;j<=m;j++){
                int mark=sc.nextInt();
                sum+=mark;
                System.out.print(mark+" ");
            }
            avg=(double)sum/m;
            System.out.print(avg+" ");
            System.out.println();
        }
    }
}
