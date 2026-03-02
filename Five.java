package For;
import java.util.Scanner;
public class Five {
    	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=0.0;
		double max=0;
		int num=0;
		int last=0;
		for(int i=1;i<=n;i++) {
			int day=sc.nextInt();
			int rooms=sc.nextInt();
			int totalroom=sc.nextInt();
			String status="";
			double occupancy=(rooms/totalroom)*100.0;
			if(occupancy<60) {
				status="low";
			}
			else if(occupancy>60&&occupancy<80) {
				status="moderate";
			}
			else if(occupancy>=80&&occupancy<100) {
				status="high";
			}
			else if(occupancy>=100) {
				status="full";
			}
			sum=sum+occupancy;
			if(occupancy>max) {
				max=occupancy;
			}
			if(status.equals("high")) {
				num++;
			}
			last=day;
			System.out.println("day: "+day);
			System.out.println("room occupied: "+rooms);
			System.out.println("total rooms: "+totalroom);
			System.out.println("status: "+status);
			
		}
		double avg=sum/n;
		System.out.println("total days: "+last);
		System.out.println("average: "+avg);
		System.out.println("peak occupancy: "+max);
		System.out.println("day at full capacity: "+num);
	}
}
