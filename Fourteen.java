package For;
import java.util.Scanner;
import java.lang.Math;
public class Fourteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double fine=0.0;
        double finecap=0.0;
        double actual=0.0;
        int count=0;
        double total=0.0;
        for(int i=0;i<n;i++){
            String book=sc.next();
            int daylate=sc.nextInt();
            double sum=0.0;
            double rate=0.0;
            if(book.equals("regular")){
                rate=0.50;
            }
            else if(book.equals("reference")){
                rate=1.00;
            }
            else if(book.equals("magazine")){
                rate=0.25;
            }

            sum=daylate*rate;
            boolean num=false;
            if(book.equals("regular")){
                finecap=0.10;
            }
            else if(book.equals("reference")){
                finecap=0.20;
            }
            else if(book.equals("magazine")){
                finecap=0.5;
            }

            actual=Math.min(sum,finecap);
            if(daylate>0){
                count++;
            }
            total+=sum;
            System.out.println("book"+" "+i+":"+book);
            System.out.println("day late: "+daylate);
            System.out.println("daily fine: "+"$"+rate);
            System.out.println("calculated fine: "+"$"+sum);
            System.out.println("actual fine: "+"$"+actual);
            System.out.println("cap applied: "+(num?"yes":"no"));
        }
        double avg=total/n;
        System.out.println("total books: "+n);
        System.out.println("total fines collected: "+"$"+total);
        System.out.println("books overdue: "+count);
        System.out.println("avg fine: "+"$"+avg);

    }
}
