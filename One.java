package For;
import java.util.Scanner;
public class One {
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      double finalsalary=0.0;
      Double percentage=0.0;
      double payroll=0.0;
      for(int i=1;i<=n;i++){
         String employee=sc.next();
         double basesalary=sc.nextDouble();
         int rating=sc.nextInt();
         if(rating==5){
            percentage=15.0;
         }
         else if(rating==4){
            percentage=10.0;
         }
         else if(rating==3){
            percentage=5.0;
         }
         else if(rating==2){
            percentage=2.0;
         }
         if(rating==1){
            percentage=0.0;
         }
         finalsalary=basesalary*(1+percentage/100.0);
         System.out.println("employee: "+employee);
         System.out.println("base salary: "+"$"+basesalary);
         System.out.println("performance rating: "+rating);
         System.out.println("increment: "+percentage+"%");
         System.out.println("final salary: "+"$"+finalsalary);
         if(i<n){
         System.out.println();
         }
         payroll+=finalsalary;
      }
      double avg=0.0;
      avg=payroll/n;
      System.out.println("total employee: "+n);
      System.out.println("total payroll: "+"$"+payroll);
      System.out.println("average salary: "+"$"+avg);
   } 
}
