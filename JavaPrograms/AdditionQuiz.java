import java.util.*;
public class AdditionQuiz{
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);		
		int num1,num2;
		num1 = (int)(Math.random() * 10) ;
		num2 = (int)(Math.random() * 10);
		int sum = num1+num2;
    
	  	System.out.println("What is the sum of " + num1 +" and "+num2);
	  	int input = in.nextInt();

	  	while(input != sum){
	  		System.out.println("try again");
	  		input = in.nextInt();
	  	}

	  	System.out.println("correct");


	}
}