package Operators;
import java.util.Scanner;
public class Operatortwelve {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int file=sc.nextInt();
        int compression=sc.nextInt();
        int size=file>>compression;
        System.out.println(size);
    }
}
