



public class Ambiguity{
	public static void sum(int...v){
		for(int x : v){System.out.println(x);}
	}
	public static void sum(int n , int...v){
		for(int x : v){System.out.println(x);}
	}
	public static void main(String [] args){
		sum(1) ;
		
	}
}