import java.util.*;
public class ScanThroughKeyBoard{
	public static void main(String[] args){
		int iNumOne , iNumTwo , iSum ;
		double dNumOne , dNumTwo , dSum ;
		float fNumOne , fNumTwo , fSum ;

		System.out.println("Enter two integers ");

		Scanner in = new Scanner(System.in);
		iNumOne = in.nextInt();
		iNumTwo = in.nextInt();
		in.nextLine();
		iSum = iNumOne+iNumTwo;
		System.out.println("Sum of " + iNumOne + " and "+iNumTwo+" = " + iSum);

		System.out.println("Enter two double ");
		
		dNumOne = in.nextDouble();
		dNumTwo = in.nextDouble();
		in.nextLine();
		dSum = dNumOne+dNumTwo;
		System.out.println("Sum of " + dNumOne + " and "+dNumTwo+" = " + dSum);

		System.out.println("Enter two float ");
		
		fNumOne = in.nextFloat();
		fNumTwo = in.nextFloat();
		in.nextLine();
		fSum = fNumOne+fNumTwo;
		System.out.println("Sum of " + fNumOne + " and "+fNumTwo+" = " + fSum);
	
        System.out.println("Enter a boolean");
        boolean yn = in.nextBoolean();
        System.out.println(yn);
        in.nextLine();

        System.out.println("Input a string");
        String line = in.nextLine();
        System.out.println(line);

        System.out.println("Enter a word");
        String word = in.next();
        System.out.println(word);
        in.nextLine();

        System.out.println("Obtain a single character");
        char character = in.next().charAt(0);
        System.out.println(character);



	}

}