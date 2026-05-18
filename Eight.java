package Day2;

import java.util.Scanner;
public class Eight{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float num=sc.nextFloat();
        float f=num*9/5+32;
        System.out.printf("%.2f",f);
    }
}