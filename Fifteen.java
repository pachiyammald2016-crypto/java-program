package For;
import java.util.Scanner;
public class Fifteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String num="";
        int count1=0;
        int count2=0;
        int highest=0;
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            String name=sc.next();
            int answers=sc.nextInt();
            int wrong=sc.nextInt();
            int attempt=sc.nextInt();

            int score=(answers*4)-(wrong*3)+(attempt*0);
            if(score>=32){
                num="pass";
                count1++;
            }
            else{
                num="fail";
                count2++;
            }
            if(score>max){
                max=score;
            }
            sum+=score;
            System.out.println("student: "+name);
            System.out.println("correct: "+answers);
            System.out.println("wrong: "+wrong);
            System.out.println("attempt: "+attempt);
            System.out.println("score: "+score);
            System.out.println("result: "+num);

        }
        double avg=sum/n;
        System.out.println("total students: "+n);
        System.out.println("pass count: "+count1);
        System.out.println("fail count: "+count2);
        System.out.println("class average: "+avg);
        System.out.println("highest score: "+max);
    }
}
