import java.util.*;
public class BirthDate{
	public static void main(String [] args)	{
		int n1, n2, n3, n4, n5 , sum = 0;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter 1 or 0 if your birthdate is in this group");
		System.out.println("16 17 18 19");
		System.out.println("20 21 22 23");
		System.out.println("24 25 26 27");
		System.out.println("28 29 30 31");
		n1=in.nextInt();
		if(n1==1){
			sum = sum+16;
		}	

		System.out.println(" 8  9 10 11");
		System.out.println("12 13 14 15");
		System.out.println("24 25 26 27");
		System.out.println("28 29 30 31");
		n2=in.nextInt();
		if(n2==1){
			sum = sum + 8;
		}
		
		System.out.println(" 4  5  6  7");
		System.out.println("12 13 14 15");
		System.out.println("20 21 22 23");
		System.out.println("28 29 30 31");
		n3=in.nextInt();
		if(n3==1){
			sum+=4;
		}

		System.out.println(" 2  3  6  7");
		System.out.println("10 11 14 15");
		System.out.println("18 19 22 23");
		System.out.println("26 27 30 31");
		n4=in.nextInt();
		if(n4==1){
			sum+=2;
		}

		System.out.println(" 1  3  5  7");
		System.out.println(" 9 11 13 15");
		System.out.println("17 19 21 23");
		System.out.println("25 27 29 31");
		n5=in.nextInt();
		if(n5==1){
			sum+=1;
		}
		
		System.out.println("Your birth date is "+sum);
	}
}