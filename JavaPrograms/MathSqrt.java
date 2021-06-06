import java.util.*;
public class MathSqrt{
	public static void main(String[] args){
		double a , b , c , s , area ;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a , b , c :");

		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();

		
		s = (a+b+c)/2;

		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

		System.out.println("The area is " + area);
	}
}