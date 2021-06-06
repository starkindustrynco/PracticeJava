import java.util.*;
public class SumN{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num , sum = 0 , i ;
		System.out.println("enter the number");
		num = in.nextInt();
		for(i=0 ; i<= num ; i++){
			sum = sum + i;
		}
		System.out.println("the sum is "  + sum);
	}
}