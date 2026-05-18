package Day2;

import java.util.Scanner;
public class Nine{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float num=sc.nextFloat();
        float area=3.14159f*num*num;
        System.out.printf("%.3f",area);
    }
}