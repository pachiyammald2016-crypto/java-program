package Day1;

public class Seventeen {
    static int digit(int a){
        int fact=1;
        while(a!=0){
            int num=a%10;
            fact*=num;
            a=a/10;
        }
        System.out.println(fact);
        return 0;
    }
    public static void main(String[] args){
        int a=1234;
        digit(a);
    }
    
}
