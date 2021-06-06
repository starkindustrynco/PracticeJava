
public class SimpleCalculator{
	public static void main(String [] args){		

	int result = 0;
	String [] tokens = args[0].split(" ") ;
    switch (tokens[1].charAt(0)){
    	case '*':result = Integer.parseInt(tokens[0])*Integer.parseInt(tokens[2]);
    	break;
    	case '-':result = Integer.parseInt(tokens[0])-Integer.parseInt(tokens[2]);
    	break;
    	case '+':result = Integer.parseInt(tokens[0])+Integer.parseInt(tokens[2]);
    	break;
    	case '/':result = Integer.parseInt(tokens[0])/Integer.parseInt(tokens[2]);    	
    	break;
    }
    System.out.println(result);
}}