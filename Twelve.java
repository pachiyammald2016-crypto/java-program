package String;
import java.util.Scanner;
import java.util.ArrayList;
public class Twelve {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Parsed fields: ");
        for(int i=0;i<n;i++){
            ArrayList<String> List=new ArrayList<>();
            String num=sc.nextLine();
            List.add(num);
            int sum=i+1;
            System.out.println(sum+". "+List);

        }
    }
}
