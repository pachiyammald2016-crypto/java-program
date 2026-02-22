package For;
import java.util.Scanner;
public class Two {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String grade="";
        String status="";
        double avg=0.0;
        int max=0;
        int count=0;
        int count1=0;
        for(int i=1;i<=n;i++){
            String name=sc.next();
            int score=sc.nextInt();
            if(score>=85&&score<=100){
                grade="A";
            }
            else if(score>=70&&score<=84){
                grade="B";
            }
            else if(score>=60&&score<=69){
                grade="C";
            }
            if(score>=50&&score<=59){
                grade="D";
            }
            if(score>=0&&score<=49){
                grade="F";
            }

            if(score>=60){
                status="Pass";
            }
            else if(score<60){
                status="Fail";
            }
            avg+=score;
            if(score>max){
                max=score;
            }
            if(status.equals("Pass")){
                count++;
            }
            else{
                count1++;
            } 
            
            System.out.println("Student: "+name);
            System.out.println("Score: "+score);
            System.out.println("letter grade: "+grade);
            System.out.println("status: "+status);
                 System.out.println();

        }
        double sum=avg/n;
        System.out.println("total students: "+n);
        System.out.println("class avg: "+sum);
        System.out.println("highest score: "+max);
        System.out.println("students passed: "+count);
        System.out.println("students failed: "+count1);

    }
}
