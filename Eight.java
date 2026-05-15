package Day1;

public class Eight {
    public static void main(String[] args){
        int num=123;
        int sum=0;
        while(num!=0){
            int digit=num%10;
            int rev=sum+(digit*digit*digit);
            num=num/10;
        }
        if(sum==num){
            System.out.println("it is true");
        }
        else{
            System.out.println("it is false");
        }
    }
    
}
