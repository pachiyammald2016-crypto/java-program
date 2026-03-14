package String;
import java.util.Scanner;
public class Eighteen {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String num="";
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if(Character.isLowerCase(ch)){
         ch=(char)((ch-'a'+3)%26+'a');
      }
      if(Character.isUpperCase(ch)){
         ch=(char)((ch-'A'+3)%26+'A');
      }
      num+=ch;
    }
    System.out.println("Original: "+s);
    System.out.println("Encrypted: "+num);
   } 
}
