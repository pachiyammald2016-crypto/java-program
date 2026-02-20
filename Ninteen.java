package Ifelse;
import java.util.Scanner;
public class Ninteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String movie=sc.next();
        String showtime=sc.next();
        String seat=sc.next();
        String customer=sc.next();

        double baseticket=12;
        double format=0.0;
        if(movie.equals("2D")){
            format=0;
        }
        if(movie.equals("3D")){
            format=5;
        }
        if(movie.equals("IMAX")){
            format=8;
        }
        if(movie.equals("4D")){
            format=10;
        }
        double fee=0.0;
        if(seat.equals("standard")){
            fee=0;
        }
        if(seat.equals("premium")){
            fee=4;
        }
        if(seat.equals("recliner")){
            fee=7;
        }
        int time=0;
        if(showtime.equals("matinee")){
            time=-30;
        }
         if(showtime.equals("evening")){
            time=0;
        }
         if(showtime.equals("prime-time")){
            time=20;
        }
         if(showtime.equals("late-night")){
            time=-20;
        }
        int discount=0;
        if(customer.equals("adult")){
            discount=0;
        }
        if(customer.equals("senior")){
            discount=25;
        }
        if(customer.equals("student")){
            discount=15;
        }
        if(customer.equals("child")){
            discount=30;
        }

        double base=baseticket+format+fee;
        double adjusted=base*(1+time/100.0);
        double finalprice=adjusted*(1-discount/100.0);
        String cons="none";
        if(showtime.equals("matinee")||customer.equals("senior")
            ||customer.equals("student")){
                    cons="yes";
                }
                else {
                    cons="no";
                }
        String category="none";
        if(finalprice<=20){
            category="value";
        }
         if(finalprice>20&&finalprice<=30){
            category="premium";
        }
         if(finalprice>30){
            category="luxury";
        }

        System.out.println("movie format: "+movie);
        System.out.println("show time: "+showtime);
        System.out.println("seat category: "+seat);
        System.out.println("customer type: "+customer);
        System.out.println("base ticket price: "+"$"+baseticket);
        System.out.println("format surcharge: "+"$"+format);
        System.out.println("seat upgrade fee: "+"$"+fee);
        System.out.println("time-based adjustment: "+time+"%");
        System.out.println("customer discount: "+discount+"%");
        System.out.println("final ticket price: "+"$"+finalprice);
        System.out.println("concession voucher: "+cons);
        System.out.println("pricing category: "+category);

        


    }
}
