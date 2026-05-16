package Day1;

public class Eighteen {
    static int digit(int a){
        while(a!=0){
            int num=a%10;
            System.out.println(num);
            a=a/10;
        }
        return 0;
    }
    public static void main(String[] args){
        int a=1234;
        digit(a);
    }
    
}
