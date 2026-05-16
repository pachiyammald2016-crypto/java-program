package Day1;

public class Fourteen {
    static void swap(int a , int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping: ");
        System.out.println("a is :"+a);
        System.out.println("b is: "+b);


    }
    public static void main(String[] args){
        int a=10;
        int b=20;
        swap(a,b);
        
    }
    
}
