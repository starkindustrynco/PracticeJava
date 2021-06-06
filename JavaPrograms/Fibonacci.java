public class Fibonacci{
	public static void main(String[] args){
		int num1 = 1 , num2 = 1 , num3 ;
		for(int i = 0 ; i < 10 ; i++){
		num3 = num1 + num2 ;
		num1 = num2 ;
		num2 = num3 ;
		System.out.println(num3);}


	}
}