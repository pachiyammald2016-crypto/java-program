package String;
import java.util.Scanner;
public class Thurteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("RNA Transcription: ");
        for(int i=0;i<n;i++){
            String ch=sc.nextLine().toUpperCase();
            if(ch.contains("T")){
                String num=ch.replace('T','U');
                System.out.println(ch+" -> "+num);
            }
            else{
                System.out.println(ch+" -> "+ch);
            }
        }
        }
    }

