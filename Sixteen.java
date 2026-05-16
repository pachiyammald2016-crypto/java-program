package Day1;

public class Sixteen {
    static int fab(int a, int b, int m){
        for(int i=1;i<=m;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        return 0;
    }
    public static void main(String[] args){
        int a=0;
        int b=1;
        int m=10;
        System.out.println("the fabonacci series is: ");
        System.out.println(a);
        System.out.println(b);
        fab(a,b,m); 
    }
}
