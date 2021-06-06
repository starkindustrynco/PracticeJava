// program to check armstrong num
import java.util.*;
public class Armstrong{
	public static void main(String[] args){
		int num , sum = 0 , x;	
		Scanner in = new Scanner(System.in);
		num = in.nextInt();	
		int temp = num ; 		 
		while(num > 0){
			x = num%10;
			num = num/10;
			sum = sum + (x*x*x);			
		}	
		System.out.println(sum);
		if(temp == sum){
			System.out.println("True");
		}
		else System.out.println("False");
	}
}