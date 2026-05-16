package Day1;

public class Ninteen {
    static void digit(int a){
        int sum=0;
        int fact=1;
        while(a!=0){
            int num=a%10;
            sum+=num;
            fact*=num;
            a=a/10;
        }
        if(sum==fact){
            System.out.println("it is spy number");
        }
        else{
            System.out.println("it is not spy number");
        }
    }
    public static void main(String[] args){
        int a=123;
        digit(a);
    }
    
}
