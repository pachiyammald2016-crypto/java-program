package Day1;

public class Eleven {
    public static void main(String[] args){
        int a=0;
        int b=1;
        int num=10;
        for(int i=1;i<=num;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
    
}
