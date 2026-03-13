package String;
import java.util.Scanner;
public class Three {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        System.out.println("Original: "+n);
        int count=1;
        for(int i=0;i<n.length();i++){
            if(i<n.length()-1&&n.charAt(i)==n.charAt(i+1)){
                count++;
            }
            else{
                
                char r=n.charAt(i);
                System.out.print(r+""+count);
                count=1;
            }
        }
    }
}
