package String;
import java.util.Scanner;
public class Eleven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ch=sc.nextLine();
            if(ch.contains("'")){
                String num=ch.replace('\'','"');
                System.out.println(ch+" -> "+num);
            }
            else{
                System.out.println(ch+" -> "+ch);
            }
        }
        }
    }
    
