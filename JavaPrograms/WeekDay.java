import java.util.*;
public class WeekDay{
	public static void main(String[] args){
		int today , afterdays , ans ;

		Scanner in = new Scanner(System.in);
		today = in.nextInt();
		afterdays = in.nextInt();
		ans = (today + afterdays)%7;
		System.out.println(ans);
	}
}