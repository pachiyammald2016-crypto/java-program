package For;
import java.util.Scanner;
public class Nine {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int burned=0;
		int total=0;
		int num=0;
		String inten="";
		for(int i=1;i<=n;i++) {
			String type=sc.next();
			int duration =sc.nextInt();
			int calorie=0;
			if(type.equals("running")) {
				calorie=10;
				inten="high";
				burned=duration*calorie;
			}
			else if(type.equals("swimming")) {
				calorie=12;
				inten="high";
				burned=duration*calorie;
			}
			else if(type.equals("cycling")) {
				calorie=8;
				inten="moderate";
				burned=duration*calorie;
			}
			else if(type.equals("gym")) {
				calorie=7;
				inten="moderate";
				burned=duration*calorie;
			}
			else if(type.equals("walking")) {
				calorie=4;
				inten="low";
				burned=duration*calorie;
			}
			total+=duration;
			num+=burned;
			System.out.println("session:"+ i+":"+type);
			System.out.println("duration: "+duration+" minutes");
			System.out.println("calories burned: "+burned);
			System.out.println("intensity: "+inten);		
		}
		double avg=num/n;
		String level="";
		if(num<300) {
			level="biginner";
		}
		else if(num>=300&&num<=1000) {
			level="intermediate";
		}
		else {
			level="advanced";
		}
		System.out.println("total workouts: "+n);
		System.out.println("total duration: "+total);
		System.out.println("total calorie: "+num);
		System.out.println("avg calorie: "+avg);
		System.out.println("fitness level: "+level);
		
	}
}
