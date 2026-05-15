package Day1;

public class Ten {
    public static void main(String[] args){
        int num=123;
        int fact=1;
        while(num!=0){
            int digit=num%10;
            fact=fact*digit;
            num=num/10;
        }
        System.out.println(fact);
    }
    
}
