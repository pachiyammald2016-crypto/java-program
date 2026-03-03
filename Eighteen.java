package For;
import java.util.Scanner;
public class Eighteen {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        String status="";
        int count1=0;
        int count2=0;
        double total=0.0;
        int max=0;
        int min=0;
        double sum1=0.0;
        double sum2=0.0;
       for(int i=1;i<=n;i++){
        int hour=sc.nextInt();
        double temp=sc.nextDouble();
        if(hour>max){
            max=hour;
            sum1=temp;

        }
        if(hour<min){
            min=hour;
            sum2=temp;
        }
        if(temp>40||temp<0){
            status="extreme";
        }
        else if(temp>=32&&temp<=40){
            status="hot";
            count1++;
        }
        else if(temp>=0&&temp<=10){
            status="cold";
            count2++;
        }
        else if(temp>=10&&temp<=32){
            status="normal";
        }

        total+=temp;

        System.out.println("hours: "+hour);
        System.out.println("status: "+status);
       } 
       double avg=total/n;
        System.out.println("total readings: "+n);
        System.out.println("avg temperature: "+avg);
        System.out.println("highest temperature: "+sum1+"C"+" at hour "+max);
        System.out.println("lowest temperature: "+sum2+"C"+" at hour "+min);
        System.out.println("hot hours: "+count1);
        System.out.println("cold hours: "+count2);

    }
}
