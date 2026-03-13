package String;
import java.util.Scanner;
public class Four {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String m=sc.nextLine();
            String num="";
            int r=m.length();

            for(int j=r-1;j>=0;j--){
                 num+=m.charAt(j);   
            }
            if(num.equalsIgnoreCase(m)){
            System.out.println(m+" - Palindrome");
        }
        else{
            System.out.println(m+" - Not Palindrome");
        }
        }
    }
}
