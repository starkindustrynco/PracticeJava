import java.util.*;
public class FiveTwo{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Say a number");
		int a = in.nextInt();
		if(a%5 == 0){
			System.out.println("Hello Five");
		}
		else if(a%2 == 0){
		System.out.println("Hello Two");
		}
		else System.out.println("No Idea");
	}
}