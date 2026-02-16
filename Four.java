import java.util.Scanner;
public class Four {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sales=sc.nextInt();
        int discount=sc.nextInt();
        int gst=sc.nextInt();
        int revenue=sales-((sales*discount)/100);
          int sum=revenue+((revenue*gst)/100); 

        System.out.println(sum);
        
    }
}
