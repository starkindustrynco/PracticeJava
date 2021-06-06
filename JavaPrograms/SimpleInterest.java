//Simple interest calculator

import java.util.*;
public class SimpleInterest{
	public static void main(String[] args){
		float P , N , R , SI ;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter principle , time and rate respectively:");
		P = in.nextFloat();
		N = in.nextFloat();
		R = in.nextFloat();
		SI = (P*N*R)/100;
		System.out.println("Your simple interest is "+ SI);
	}
}