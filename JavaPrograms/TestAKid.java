import java.util.*;
public class TestAKid{
	public static void main(String[] args){
		System.out.println("What is 5+10?");
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		boolean yn = (input==15);
		System.out.println("Your answer is " + yn);
	}
}