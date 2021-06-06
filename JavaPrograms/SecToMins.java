import java.util.*;
public class SecToMins{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int sec , mins , remSec ;
		sec = in.nextInt();
		mins = sec/60;
		remSec = sec%60 ;
		System.out.println("Mins = "+mins+"\n"+"Secs = "+remSec);

	}
}