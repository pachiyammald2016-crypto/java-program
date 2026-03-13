package String;
import java.util.Scanner;
public class Two {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<s;i++){
            String m=sc.nextLine(); 

        boolean hasUpper=false;
        boolean hasLower=false;
        boolean hasDigit=false;
        boolean hasSpecial=false;

        for(int j=0;j<m.length();j++){
            char ch=m.charAt(j);

            if(Character.isUpperCase(ch)){
                hasUpper=true;
            }
            else if(Character.isLowerCase(ch)){
                hasLower=true;
            }
            else if(Character.isDigit(ch)){
                hasDigit=true;
            }
            else{
                hasSpecial=true;
            }
        }
        if(m.length()>=8&&hasUpper&&hasLower&&hasDigit&&hasSpecial){
            System.out.println(m+" -Strong");
        }
        else{
            System.out.println(m+" -Weak");
        }
      }
    }
}
