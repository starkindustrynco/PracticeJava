import java.util.*;
public class Lottery{
	public static void main(String[] args)	{
		int num1=2, num2=4;
		int res1, res2;
		System.out.println("Enter your number");
		Scanner in = new Scanner(System.in);
		res1=in.nextInt();
		res2=in.nextInt();
		if((num1==res1)&&(num2==res2)){
			System.out.println("You won 3 lakhs");
		}

		else if((num2==res1)||(num1==res2)){
				System.out.println("You won 2 lakhs");
		}	
		else if((num1==res1)||(num2==res2)){
			System.out.println("You won 1 lakh");
		}
		else System.out.println("You Lost!");
		
	}
}
