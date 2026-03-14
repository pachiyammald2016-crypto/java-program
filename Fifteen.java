package String;
import java.util.Scanner;
public class Fifteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s=sc.nextLine().toLowerCase();
            String num=s.replaceAll("[^a-z0-9]"," ");
            String r=num.replaceAll("\\s+"," ");
           System.out.println(r.trim());
        }
    }
}
