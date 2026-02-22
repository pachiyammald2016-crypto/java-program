package For;
import java.util.Scanner;
public class Three {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String status="";
        double quantity=0;
        int count=0;
        int count1=0;
        int sum=0;
        for(int i=1;i<=n;i++){
            String product=sc.next();
            int current=sc.nextInt();
            int minimum=sc.nextInt();

           if(current>=minimum){
            status="Adequate";
           } 
           else if(current<minimum&&current>=(minimum/2)){
            status="Low stock";
            count++;
           }
           else if(current<(minimum/2)){
            status="Critical";
            count1++;
           }

           if(status.equals("Adequate")){
            quantity=0;
           }
           else if(status.equals("Low stock")){
            quantity=((minimum-current)*2);
           }
           else if(status.equals("Critical")){
            quantity=(minimum-current)*2;
           }
            System.out.println("product: "+product);
            System.out.println("current stock: "+current);
            System.out.println("minimum stock: "+minimum);
            System.out.println("status: "+status);
            System.out.println("reorder quantity: "+quantity);
             System.out.println();
             sum+=quantity;
        }

        System.out.println("total products: "+n);
        System.out.println("low stock items: "+count);
        System.out.println("critical items: "+count1);
        System.out.println("total reorder quantity: "+sum);
    }
}
