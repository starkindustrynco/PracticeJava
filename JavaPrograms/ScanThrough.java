import java.util.*;
public class ScanThrough{
	public static void main(String[] args){
		int num1;
		float num2;
		boolean yn;

	Scanner in = new Scanner(System.in);	

    System.out.println("input int");
    num1 = in.nextInt();
    System.out.println(num1);

    System.out.println("input float");
    num2 = in.nextFloat();
    System.out.println(num2);   
    in.nextLine();
    
    
    System.out.println("Enter string");
    String line = in.nextLine();
    System.out.println(line);

    System.out.println("enter boolean");
    yn = in.nextBoolean();
    System.out.println(yn);
    // in.nextLine();

    System.out.println("Enter word");
    String word = in.next();
    System.out.println(word);

    System.out.println("Enter string");
    char character = in.next().charAt(0);
    System.out.println(character);    

	}
}